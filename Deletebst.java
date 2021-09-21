package bst;
import java.util.Scanner;



    class BST1{
        public Node insert(Node node,int val){
            if(node==null){
                return createNewNode(val);
            }
            if(val<node.data){
                node.left=insert(node.left,val);

            }
            if(val>node.data){
                node.right=insert(node.right,val);
            }
            return node;
        }

        public Node createNewNode(int val){
            Node a=new Node();
            a.data=val;
            a.left=null;
            a.right=null;
            return a;
        }

        public static Node deleteNode(Node node,int val){
            if(node==null){
                return null;
            }
            if(val<node.data){
                node.left=deleteNode(node.left,val);
            }
            else if(val>node.data){
                node.right=deleteNode(node.right,val);
            }
            else{
                if(node.left==null ||node.right==null) {      //if both child are null or has one child
                    Node temp = null;
                    temp = node.left == null ? node.right : node.left;

                    if (temp == null){
                        return null;
                    }
                    else{
                        return node;
                    }
                }
                else{                 //both child we should find inorder successor
                   Node successor=getSuccessor(node);
                   node.data=successor.data;
                   node.right=deleteNode(node.right,successor.data);
                   return node;
                }

            }
            return node;
        }

        public static Node getSuccessor(Node successor){
            if(successor==null){
                return null;
            }
            Node temp=successor.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            return temp;
        }


        public static  void inOrder(Node node){
            if(node!=null) {
                inOrder(node.left);
                System.out.println(node.data);
                inOrder(node.right);
            }

        }

    }
public class Deletebst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST1 a = new BST1();
        Node root = null;
        System.out.println("enter the number of values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = a.insert(root, sc.nextInt());

        }
        System.out.println("enter the date to be removed");
        int data=sc.nextInt();
        root=a.deleteNode(root,data);
        a.inOrder(root);

    }
}
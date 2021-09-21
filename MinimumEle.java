package bst;

import java.util.Scanner;



class BST2 {

    public Node insert(Node node, int val) {
        if(node == null) {
            return createNewNode(val);
        }

        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
//minimum element
    public  static  int minValue(Node node){
        Node current=node;
        while(current.left!=null){
            current=current.left;
        }
        return current.data;
    }

    /*
//maximum element
public  static  int maxValue(Node node){
    Node current=node;
    while(current.right!=null){
        current=current.right;
    }
    return current.data;
}
*/
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }


    }
}

public class MinimumEle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BST2 a = new BST2();
        Node root = null;
        System.out.println("enter the number of values");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            root = a.insert(root,sc.nextInt());

        }
        System.out.println(a.minValue(root));
       // System.out.println(a.maxValue(root));

    }
}


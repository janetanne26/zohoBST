package bst;

import java.util.Scanner;

class BST3{

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

    public static Node leastCA(Node node,int n1,int n2){
        if(node==null){
            return null;
        }
        if(node.data<n1&&node.data<n2){
            return leastCA(node.right,n1,n2);
        }
        if(node.data>n1&&node.data>n2){
            return leastCA(node.left,n1,n2);
        }
        return node;
    }

}
public class LowestCommonAncestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST3 a = new BST3();
        Node root = null;
        System.out.println("enter the number of values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = a.insert(root, sc.nextInt());

        }
        System.out.println("node 1");
        int n1=sc.nextInt();
        System.out.println("Node 2");
        int n2=sc.nextInt();
        Node val=a.leastCA(root,n1,n2);
        System.out.println(val.data);


    }
}
package bst;

import java.util.Scanner;

public class Trim {
    static class Node {

        Node left;
        Node right;
        int data;


    }

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    //trim
    public static Node trimBst(Node root,int low,int high){
        if(root==null){
            return null;
        }
        if(root.data<low){
            return trimBst(root.right,low,high);
        }
        if(root.data>high){
            return trimBst(root.left,low,high);
        }
        root.left=trimBst(root.left, low,high);
        root.right=trimBst(root.right,low,high);
       return root;
    }
    public static void inOrder(Node root) {
        if (root != null) {

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trim a = new Trim();
        Node root = null;
        System.out.println("enter the number of values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = a.insert(root, sc.nextInt());

        }
        System.out.println("enter low value");
        int low=sc.nextInt();
        System.out.println("enter high value");
        int high=sc.nextInt();
        Node val=trimBst(root,low,high);

        inOrder(val);
    }
}
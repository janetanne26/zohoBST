package bst;

import java.util.Scanner;

public class SearchBst {
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

    public static Node searchBst(Node node,int key){
        if(node==null){
            return node;

        }
        if(node.data==key){
             return node;
        }
        return node.data>key? searchBst(node.left,key):searchBst(node.right,key);
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchBst a = new SearchBst();
        Node root = null;
        System.out.println("enter the number of values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = a.insert(root, sc.nextInt());

        }
        System.out.println("enter the key to be searched");
        int key=sc.nextInt();
        Node ans=searchBst(root,key);
        preOrder(ans);
    }
}
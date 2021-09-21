package bst;

import java.util.Scanner;

class Node {

        Node left;
        Node right;
        int data;


    }

    class BST {

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
        public static void inOrder(Node root){
            if(root!=null){
                inOrder(root.left);
                System.out.println(root.data);
                inOrder(root.right);
            }


        }
    }

public class InsertBst {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            BST a = new BST();
            Node root = null;
            System.out.println("enter the number of values");
            int n=sc.nextInt();
        for(int i=0;i<n;i++) {
          root = a.insert(root,sc.nextInt());

        }

            System.out.println("insert data");
        int k=sc.nextInt();
        root=a.insert(root,k);
            a.inOrder(root);

        }
    }

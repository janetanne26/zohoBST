package bst;

import java.util.Scanner;

public class MinimumAbsolute {

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

        public static int minDiff(Node root){
            int[] newArr=inOrder(root);
            int minval=Integer.MAX_VALUE;
            for(int i=0;i<k-1;i++) {
                minval = Math.min(minval,arr[i+1]-arr[i]);
            }
            return minval;
        }
        static int k=0;
        static  int[] arr=new int[20];
        public static int[] inOrder(Node root) {

            if (root != null) {
                inOrder(root.left);

                arr[k++] = root.data;

                inOrder(root.right);
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            MinimumAbsolute a = new MinimumAbsolute();
            Node root = null;
            System.out.println("enter the number of values");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                root = a.insert(root, sc.nextInt());

            }
            System.out.println("Min value "+minDiff(root));
        }
    }



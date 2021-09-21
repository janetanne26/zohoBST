package bst;

import java.util.Scanner;

public class SumOfBst {
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
static int[] arr=new int[20];
static int k=0;
    public static int[] inOrder(Node root) {


        if (root != null) {
            inOrder(root.left);

            arr[k++]=root.data;

            inOrder(root.right);
        }


return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfBst a = new SumOfBst();
        Node root = null;
        System.out.println("enter the number of values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = a.insert(root, sc.nextInt());

        }
        System.out.println("enter the m value");
        int m=sc.nextInt();
        int newArr[]=inOrder(root);
        /*//print
        for(int i=0;i<k;i++){
            System.out.println(newArr[i]);
        }*/
        int sum=0;
        for(int i=0;i<m;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}

package bst;

import java.util.Scanner;


  class BST4 {

      public static Node constructBst(int[] arr, int n) {
          if (n == 0) {
              return null;
          }
          Node root=null;
        for(int i=0;i<n;i++){
            root=levelOrder(root,arr[i]);
        }
return root;
      }

public static Node levelOrder(Node node,int val){  //similar to insert
          if(node==null){
              return createNewNode(val);
          }
          if(val<= node.data){
              node.left=levelOrder(node.left,val);
          }
          if(val>= node.data){
              node.right=levelOrder(node.right,val);
          }
          return node;
}




      public static Node createNewNode(int k) {
          Node a = new Node();
          a.data = k;
          a.left = null;
          a.right = null;
          return a;
      }
      public static void preOrder(Node root) {
          if (root != null) {

              System.out.println(root.data);
              preOrder(root.left);
              preOrder(root.right);
          }
      }
  }

public class LevelOrder {
    public static void main(String[] args) {
        BST4 tree = new BST4();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the n value");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
          Node root=tree.constructBst(arr,n);

            System.out.println("Preorder traversal of constructed BST");
            tree.preOrder(root);

        }
    }


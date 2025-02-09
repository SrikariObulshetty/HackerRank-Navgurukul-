import java.io.*;

import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " -> " + node.data + " <- ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
    

    public static Node construct(int []inorder, int l, int h){
        if(l>h){
            return null;
        }
        int mid=(l + h) / 2;
        Node root=new Node(inorder[mid], null, null);
        root.left = construct(inorder, l, mid-1);
        root.right = construct(inorder, mid +1, h);
        return root;     
    }
        
    public static Node constructFromInOrder(int[] preOrder) {  
         Arrays.sort(preOrder);
         return construct(preOrder, 0, preOrder.length-1);
     }
  
  
  public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n = scn.nextInt();
    int[] in = new int[n];
    for (int i = 0; i < n; i++)
        in[i] = scn.nextInt();

    Node root = constructFromInOrder(in);
    display(root);  
  }

}

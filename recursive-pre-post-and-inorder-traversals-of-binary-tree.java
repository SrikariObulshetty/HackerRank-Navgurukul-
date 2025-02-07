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

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
    
  public static void preOrder(Node node){
       // Preorder -> Node -> Left -> Right.
         if(node==null){
             return;
         }
         System.out.print(node.data+" "); // print node's data
         preOrder(node.left);    // then , process left subtree
         preOrder(node.right);    // then, process right subtree
  }
    
  public static void inOrder(Node node){
      // Left -> Node -> Right.
      if(node==null){
          return;
      }
      inOrder(node.left); // process left subtree first
      System.out.print(node.data+" "); // then print curr node's data
      inOrder(node.right);             // process right subTree
  }
    
  public static void postOrder(Node node){
      // Left -> Right -> Node
      if(node==null){
          return;
      }
      postOrder(node.left); // process entire left subtree first
      postOrder(node.right);  // process entire right subtree
      System.out.print(node.data+" "); // print currrent node's data     
  }  


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }
      Node root = construct(arr);
   
      preOrder(root);
      System.out.println();
      inOrder(root);
      System.out.println();
      postOrder(root); 
  }

}
        
        

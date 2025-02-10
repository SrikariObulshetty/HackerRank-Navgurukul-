import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0){
            int sz = q.size();
            for(int i=0;i<sz;i++){
                Node temp = q.remove();
                System.out.print(temp.data + " ");
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
  
   public static Node helper(int in[], int post[], int []idx, int l, int h, HashMap<Integer, Integer>map){
         if(l > h){
             return null;
         }
         int curr = post[idx[0]];
         idx[0]--;
         Node node = new Node(curr);
         int inIdx = map.get(curr);
         node.right= helper(in, post, idx, inIdx + 1, h, map);
         node.left=helper(in, post, idx, l, inIdx-1, map);
         return node;
       
   }
  
    public static Node constructTree(int [] post, int [] in){
      HashMap<Integer, Integer> map=new HashMap<>();
        int n=in.length;
        for(int i=0;i<n;i++){
            map.put(in[i], i);
        }
        int idx[]= new int[1];
        idx[0]=n-1;
        return helper(in, post,idx,  0, n-1, map);
      
    }

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int in[] = new int [n];
      for(int i=0;i<n;i++){
          in[i] = scn.nextInt();
      }
      
      int post[] = new int [n];
      for(int i=0;i<n;i++){
          post[i] = scn.nextInt();
      }
  
      Node root = constructTree(post,in);
      levelOrderTraversal(root);
  }

}

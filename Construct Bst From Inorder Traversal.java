import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printBST(Node root){
        if(root==null){
            return;
        }
        if(root.left==null){
            System.out.print(". -> ");
        }
        else{
            System.out.print(root.left.data+" -> ");
        }
        System.out.print(root.data);
        if(root.right==null){
            System.out.print(" <- .");
        }
        else{
            System.out.print(" <- " + root.right.data);
        }
        System.out.println();
        printBST(root.left);
        printBST(root.right);
    }
    public static Node createBST(int [] inorder, int l, int h){
        if(l>h){
            return null;
        }
        int mid=(l+h)/2;
        Node root=new Node(inorder[mid]);
        root.left=createBST(inorder, l, mid-1);
        root.right=createBST(inorder, mid+1, h);
        return root;
        
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int inorder[]=new int[n];
        int i=0;
        while(i<n){
            inorder[i++]=scn.nextInt();
        }
        Node root=createBST(inorder, 0, n-1);
        printBST(root);
    }
}

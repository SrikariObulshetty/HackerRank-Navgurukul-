import java.io.*;
import java.util.*;

public class Solution {
    public static void printList(List<List<Integer>>adj, int n){
          for(int i=0;i<n;i++){
              System.out.print(i+" ");
              for(int k:adj.get(i)){
                  System.out.print(k+" ");
              }
              System.out.println();
          }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        //using list of list  integers
        // can also arr of lists
        List<List<Integer>>adj=new ArrayList<>();
        // INITIALISATION
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
           int u=scn.nextInt();
           int v=scn.nextInt();
           adj.get(u).add(v);
           adj.get(v).add(u);
        }
        printList(adj,n);
    }
}

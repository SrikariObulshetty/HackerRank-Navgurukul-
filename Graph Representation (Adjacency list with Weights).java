import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair{ //nested class, so can be static
        int node;
        int nbr;
        Pair(int node, int nbr){
            this.node=node;
            this.nbr=nbr;
        }
    }
    public static void printList(List<List<Pair>>adj, int n){
         for(int i=0;i<n;i++){
             System.out.print(i+" -> "+"{");
             for(int j=0;j<adj.get(i).size();j++){
                Pair p=adj.get(i).get(j);
                System.out.print("(" + p.node+","+ p.nbr+")");
             }
             System.out.println("}");
         } 
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        List<List<Pair>>adj=new ArrayList<>();
        //INITIALISATION
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            int wt=scn.nextInt();
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        printList(adj, n);
        
    }
}

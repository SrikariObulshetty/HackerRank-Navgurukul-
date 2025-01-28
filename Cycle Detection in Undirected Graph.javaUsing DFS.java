import java.io.*;
import java.util.*;

public class Solution {
    public static boolean dfs(List<List<Integer>> adj, int par, int child, int []vis){
         vis[child]=1;
         for(int nbr: adj.get(child)){
               if(vis[nbr]==0){  // good ay of writing if-else conditions
                   return dfs(adj, child, nbr, vis);
               }
               else if(nbr !=par){
                   return true;
               }
         }
        return false;
    }
    public static boolean detectCycleDfs(List<List<Integer>>adj){
        int vis[] =new int[adj.size()];
        for(int i=0;i<adj.size();i++){
             if(vis[i]==0){
                 if(dfs(adj, -1, i, vis) == true){
                       return true;
                 }
             } 
        }
        return false;
         
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        //creating adj list
        List<List<Integer>> adj=new ArrayList<>();
        //INITIALISATION
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        //adding edges
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);            
        }
        System.out.println( detectCycleDfs(adj) );
        
    }
}

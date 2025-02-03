import java.io.*;
import java.util.*;

public class Solution {
    public static String dfs(List<List<Integer>>adj, int vis[], int pathVis[], int node){
        vis[node]=1;
        pathVis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0 && dfs(adj, vis, pathVis, nbr).equals("No")){
                return "No"; // cycle exists
            }
            else if(pathVis[nbr]==1){ // cycle exists so false
                return "No";
            }
        }
        pathVis[node]=0; // backtracking
        return "Yes";
        
    }
    public static String courseScheduler(List<List<Integer>>adj, int v){
         // check if any cycle exists
         // same procedure like directed graph using dfs
         int vis[]=new int[v];
         int pathVis[]=new int[v];
         for(int i=0;i<v;i++){
             if(vis[i]==0 && dfs(adj,vis, pathVis, i).equals("No") ){
                   return "No";
             }
         }
         return "Yes";
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int v=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>>adj=new ArrayList<>();
        // initialisation
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        // adding directed edges
        for(int i=0;i<e;i++){
            int s=scn.nextInt();
            int d=scn.nextInt();
            adj.get(s).add(d);
        }
        System.out.println( courseScheduler(adj, v) );
        
    }
}

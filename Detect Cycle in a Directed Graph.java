import java.io.*;
import java.util.*;

public class Solution {
    public static boolean dfs(List<List<Integer>> adj, int []vis, int pathVis[], int node){
        vis[node]=1;
        pathVis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0 && dfs(adj, vis, pathVis, nbr)==true){ 
               // return dfs(adj, vis, pathVis, nbr); // coz if one nbr is false, we can try for others but we can't \
                // directly say false, that is missing here.
                return true;
            }
            else if(pathVis[nbr]==1){ // it means vis[nbr] is 1 nd if pathVis[nbr] is also one , yeah a cycle exist in 
                 // directed graph;
                 return true;
            }
          
        }
        pathVis[node]=0; // backtracking
        return false;
        
    }
    public static boolean detectCycle(List<List<Integer>> adj, int n){
        int vis[]=new int[n];
        int pathVis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(dfs(adj, vis, pathVis,i)==true){
                    return true;
                }
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int v=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>> adj=new ArrayList<>();
        // Initialisation
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        // add edges -> directed edges
        for(int i=0;i<e;i++){
            int s=scn.nextInt();
            int d=scn.nextInt();
            adj.get(s).add(d);
        }
        System.out.println( detectCycle(adj, v) );
        
    }
}

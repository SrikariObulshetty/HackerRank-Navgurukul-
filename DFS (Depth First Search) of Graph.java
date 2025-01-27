import java.io.*;
import java.util.*;

public class Solution {
    public static void dfs(List<List<Integer>> adj, int vis[], int node){
        vis[0]=1;
        System.out.print(node+" ");
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                vis[nbr]=1;
                dfs(adj, vis,nbr);
            }
        }
        
          
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>> adj=new ArrayList<>();
        //INITIALISATION
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int vis[]=new int[n];
        dfs(adj,vis,0);
    }
}

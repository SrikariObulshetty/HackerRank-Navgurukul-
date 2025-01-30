import java.io.*;
import java.util.*;

public class Solution {
    public static void dfs(List<List<Integer>>adj, int vis[], int node,Stack<Integer>st){
         vis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                dfs(adj, vis, nbr, st);
            }
        }
        st.push(node);
         
    }
    public static void topoSort(List<List<Integer>>adj, int n){
         int vis[]=new int[n];
         Stack<Integer>st=new Stack<>();
         for(int i=0;i<n;i++){
             if(vis[i]==0){
                 dfs(adj, vis, i, st);
             }
         }
        while(st.size() > 0){
            System.out.print(st.pop()+" ");
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>>adj=new ArrayList<>();
        // initialisation
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>() );
        }
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            adj.get(u).add(v); // directed graph
        }
        topoSort(adj, n);
        
        
    }
}

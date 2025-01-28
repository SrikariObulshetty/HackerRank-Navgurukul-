import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair{ // class to keep track of parent of evry node
        int node;
        int nbr;
        public Pair(int nbr, int node){
            this.node=node;
            this.nbr=nbr;
        }
    }
    public static boolean bfs(List<List<Integer>>adj, int []vis, int node){
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(node, -1));
        vis[node]=1;
        while(q.size() > 0){
             Pair p=q.poll();
             for(int nbr:adj.get(p.nbr) ){
                 if(vis[nbr]==1){
                     if(nbr != p.node){ // we visited nbr through other node not curr 'p' node
                           return true;  // but we started in two diff paths, so cycle exists
                     }
                 }
                 else{
                     q.offer(new Pair(nbr, p.nbr));
                     vis[nbr]=1;
                 }
             }
        }
        return false;
    }
    public static boolean detectCycleBfs(List<List<Integer>>adj, int n){
        int vis[]=new int[n];
        for(int i=0;i<n;i++){ // this loop is for traversing through all 
            // components if disconnected components are present
            if(vis[i]==0){ // this node is not yest visited
                 if(bfs(adj, vis, i)==true){
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
        System.out.println( detectCycleBfs(adj, n) );
        
        
    }
}

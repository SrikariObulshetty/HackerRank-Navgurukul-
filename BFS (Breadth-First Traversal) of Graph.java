import java.io.*;
import java.util.*;

public class Solution {
    public static void bfs(List<List<Integer>> adj, int n){
        Queue<Integer>q=new LinkedList<>();
        int vis[]=new int[n];
        q.offer(0);
        vis[0]=1;
        while( q.size() > 0){
             int p=q.poll();
             System.out.print(p + " ");
            for(int nbr:adj.get(p)){ //before adding into queue,
                // check whether vis[nbr]=0 or not
                if(vis[nbr]==0){
                    q.offer(nbr);
                    vis[nbr]=1; // don't forget these bruh, will get overflow error
                }
            }         
        }
    } 
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>>adj=new ArrayList<>();
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
        
        bfs(adj, n);
        
        
    }
}

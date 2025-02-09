import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Pair{
        int v;
        int wt;
        public Pair(int v, int wt){
            this.v=v;
            this.wt=wt;
        }
    }
    public static int [] dijkstra(List<List<Pair>>adj, int n, int src){
        int dis[] = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> a.wt-b.wt);
        pq.offer( new Pair(src, 0));
        dis[src]=0;
        while(pq.size() > 0){
            Pair p=pq.poll();
            int v=p.v;
            for(Pair nbr : adj.get(v)){
                if(dis[nbr.v] > nbr.wt + dis[v]){
                    dis[nbr.v] = nbr.wt + dis[v];
                    pq.offer( new Pair(nbr.v,dis[nbr.v]));
                } 
            }
        }
        return dis;
    }
    

    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
        int src=scn.nextInt();
        List<List<Pair>> adj=new ArrayList<>();
        //initialising
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            int wt=scn.nextInt();
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        int dis[]=dijkstra(adj,n,src);
        for(int i=0;i<dis.length;i++){
             System.out.print(dis[i]+" ");
         }
        
        
    }
}





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
      static class Pair{
          int v;
          int wt;
      Pair(int n, int wt){
          this.v=n;
          this.wt=wt;
      }
     }
       
    public static void shortestPath(List<List<Pair>>adj, int n){
        int vis[] = new int[n];
        int ans[]=new int[n];
        Arrays.fill(ans, -1);
        Queue<Pair> q= new LinkedList<>();
        q.offer(new Pair(0,0));
        vis[0]=1;
        ans[0]=0;
        while(q.size() > 0){
            Pair p=q.poll();
            int v=p.v;
            int wt=p.wt;
            for(Pair nbr : adj.get(v)){
                if(vis[nbr.v]==0){
                    q.offer(nbr);
                    vis[nbr.v]=1;
                    ans[nbr.v]= ans[v] + nbr.wt;
                }
                else{
                    if(ans[nbr.v] > ans[v] + nbr.wt ){
                        q.offer(nbr);
                        ans[nbr.v] = ans[v] + nbr.wt;
                    }
                }
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }    
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int e=scn.nextInt();
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
        }
        shortestPath(adj,n);
    }
}

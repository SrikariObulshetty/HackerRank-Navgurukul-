import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void shortestPath(List<List<Integer>>adj, int n, int src){
        int ans[]=new int[n];
        int vis[]=new int[n];
        Arrays.fill(ans, -1);
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        vis[src]=1;
        ans[src]=0;
        while(q.size()>0){
            int p=q.poll();
            for(int nbr:adj.get(p)){
                if(vis[nbr]==0){
                    q.offer(nbr);
                    ans[nbr]=ans[p] + 1;
                    vis[nbr]=1;
                }
                else{
                    if( ans[nbr] > ans[p] + 1){
                        ans[nbr]=ans[p] + 1;
                        q.offer(nbr);
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
        List<List<Integer>> adj=new ArrayList<>();
        //initialising
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<e;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int src=scn.nextInt();
        shortestPath(adj, n,src );
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    
    public static String courseScheduler(List<List<Integer>>adj, int v, int[] indegree){
         // check if any cycle exists
         // topo Sort using "BFS"
         Queue<Integer>q=new LinkedList<>();
         for(int i=1;i<=v;i++){
             if(indegree[i]==0){
                 q.offer(i);
             }
         }
         int count=0;
         while(q.size() > 0){
            int vtx=q.poll();
            count++;
            for(int nbr:adj.get(vtx)){
                indegree[nbr]--; // reduce indegree
                if(indegree[nbr]==0){
                    q.offer(nbr);
                }
           }   
         }
         return (count==v)? "Yes" : "No";
        
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int v=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>>adj=new ArrayList<>();
        // initialisation
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<>());
        }
        // adding directed edges
        int indegree[]=new int[v+1];
        for(int i=0;i<e;i++){
            int s=scn.nextInt();
            int d=scn.nextInt();
            adj.get(s).add(d);
            // update indegrees
            indegree[d]++;  
        }
        System.out.println( courseScheduler(adj, v, indegree) );
        
    }
}

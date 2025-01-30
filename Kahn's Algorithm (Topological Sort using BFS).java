import java.io.*;
import java.util.*;

public class Solution {
     public static void kahnsAlgo(List<List<Integer>>adj, int []indegree, int n){
         Queue<Integer>q=new LinkedList<>();
         for(int i=0;i<n;i++){
             if(indegree[i]==0){
                 q.offer(i);
             }
         }
         while(q.size()>0){
             int t=q.poll();
             System.out.print(t+" ");
             for(int nbr:adj.get(t) ){
                  indegree[nbr]--;
                  if(indegree[nbr]==0){
                      q.add(nbr);
                  }
             }
         }
          
     }
     public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int v=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>> adj=new ArrayList<>();
        
        int indegree[]=new int[v];
         Arrays.fill(indegree,0);
        // initialisation
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<e;i++){
            int s=scn.nextInt();

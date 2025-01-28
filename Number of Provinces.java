import java.io.*;
import java.util.*;

public class Solution {
    public static void bfs(List<List<Integer>> adj, int []vis, int node){
        vis[node]=1;
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        while(q.size() > 0){
            int p=q.poll();
            for(int nbr:adj.get(p)){
                if(vis[nbr]==0){
                    q.add(nbr);
                    vis[nbr]=1;
                }
            }
        }
    }
    public static int provinces(List<List<Integer>>adj, int n){
         int count=0;
          int vis[]=new int[n];
          for(int i=0;i<n;i++){
              if(vis[i]==0){
                 count++;
                 bfs(adj, vis, i); 
              }
          } 
          return count;
    }
    public static List<List<Integer>> createList(int [][]mat, int n){
            List<List<Integer>>adj=new ArrayList<>();
            //INITIALISATION
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                     if(mat[i][j]==1 && i!=j){ // edge is present so add
                          adj.get(i).add(j);
                     }
                 }
            }
            return adj;
           
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        // convert into adjList
        List<List<Integer>> adj=createList(mat, n);
        System.out.println( provinces(adj, n));
        
        
    }

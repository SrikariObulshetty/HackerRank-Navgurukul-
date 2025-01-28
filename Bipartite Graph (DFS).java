import java.io.*;
import java.util.*;

public class Solution {
    public static boolean dfs(List<List<Integer>>adj, int node, int []color){
         for(int nbr:adj.get(node)){
             if(color[nbr]==-1){
                   color[nbr]= color[node] ^ 1;
                   dfs(adj, nbr, color); // here don't mention return coz we have to explore all nbr's nd then
                                         // come to a conclusion
             }
             else if(color[nbr]==color[node]){ //either it is 0 or 1
                 return false;
             }
         }
        return true;
          
         
    }
    public static boolean bipartiteGraph(List<List<Integer>>adj, int n){
           int color[]=new int[n];
           Arrays.fill(color, -1);
           for(int i=0;i<n;i++){
               if(color[i]==-1){
                   color[i]=0;
                   if(dfs(adj, i,color) ==false){
                        return false;
                   }
               }
           }
           return true;
           
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
        System.out.println(bipartiteGraph(adj, n));
        
        
    }
}

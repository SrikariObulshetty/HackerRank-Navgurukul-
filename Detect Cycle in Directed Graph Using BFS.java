import java.io.*;
import java.util.*;

public class Solution {
    public static boolean detectCycle(List<List<Integer>>adj, int v, int indegree[]){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){ // boz of this loop it will check for disconnected 
                q.offer(i);     // components also, no need of other steps for disconnected components
            }
        }
        int count=0;
        while(q.size()>0){
            int vtx=q.poll();
            count++;
            for(int nbr:adj.get(vtx)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.offer(nbr);
                }
            }
        }
        return (count==v) ? false : true;
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int v=scn.nextInt();
        int e=scn.nextInt();
        List<List<Integer>>adj=new ArrayList<>();
        // initialisation
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        // indegree array
        int indegree[]=new int[v];
        for(int i=0;i<e;i++){
            int s=scn.nextInt();
            int d=scn.nextInt();
            adj.get(s).add(d);
            indegree[d]++;
        }
        System.out.println( detectCycle(adj, v, indegree) );
    }
}

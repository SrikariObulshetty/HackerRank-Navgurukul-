import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Pair{
         int row;
         int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
   public static int findFresh(int mat[][], int r, int c){
          int orges=0;
          for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                  if(mat[i][j]==1){
                      orges++;
                  }
              }
          }
         return orges;    
   }
    public static void rottingOranges(int [][]mat, int r, int c){
        Queue<Pair>q= new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==2){
                    q.offer(new Pair(i,j));
                }
            }
        }
        int frsh=findFresh(mat, r, c);
        
        int dr[]={-1, 0, 1, 0};
        int dc[]={0, 1, 0, -1};
        int time=0;
        boolean flag=false;
        while(q.size() > 0){
            flag=false;
            int s=q.size();
             while(s > 0){                                               
                Pair p=q.poll(); 
                for(int i=0;i<4;i++){
                    int nr= p.row + dr[i];
                    int nc= p.col + dc[i];
                 
                    if(nr>=0 && nr<r && nc>=0 && nc<c && mat[nr][nc]==1){
                        mat[nr][nc]=2;
                        frsh--;
                        flag=true;
                        q.offer(new Pair(nr, nc));
                    }
                }
                s--;
            }
            if(flag==true){ // time incremented only when atleast one fresh orge is rottened.
               time++;
            }
        }
        if(frsh==0){
            System.out.println(time);
            return;
        }
        System.out.println(-1);  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        rottingOranges(mat, r, c);
    }
}

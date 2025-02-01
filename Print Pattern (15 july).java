import java.io.*;
import java.util.*;

public class Solution {
    public static void printPattern(int mat[][], int r, int c){
          int dir=1;
          int row=0;
          for(int j=0;j<c;j++){
              for(int i=0;i<r;i++){
                  System.out.println(mat[row][j]);
                  row+=dir;
              }
              dir*=-1;
              row+=dir; // to get rid or array idx out of exception
          }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // rows
        int m=scn.nextInt();  // cols
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        printPattern(mat,n,m);    
    }
}

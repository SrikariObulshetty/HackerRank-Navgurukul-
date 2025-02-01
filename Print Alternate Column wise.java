import java.io.*;
import java.util.*;

public class Solution {
    public static void printAlternateColumn(int mat[][], int m, int n){
         for(int j=0;j<n;j+=2){
             for(int i=0;i<m;i++){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt(); // rows
        int n=scn.nextInt(); // cols
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        printAlternateColumn(mat,m,n);
    }
}

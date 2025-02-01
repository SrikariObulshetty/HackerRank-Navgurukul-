import java.io.*;
import java.util.*;

public class Solution {
    public static void printAlternateRows(int mat[][], int m, int n){
         for(int i=0;i<m;i+=2){
             for(int j=0;j<n;j++){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt(); //rows 
        int n=scn.nextInt(); //cols
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        printAlternateRows(mat,m,n);
    }
}

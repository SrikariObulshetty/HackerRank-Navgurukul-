import java.io.*;
import java.util.*;

public class Solution {
    public static void lowerTriangle(int mat[][], int r, int c){
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 if(i<j){
                     System.out.print(0+" ");
                 }
                 else{
                     System.out.print(mat[i][j]+" ");
                 }
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt(); // rows
        int c=scn.nextInt(); // cols
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        lowerTriangle(mat, r, c);
        
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void modifyingRows(int [][]mat, int r, int c){
            for(int i=1;i<r;i++){
                if(mat[i][0]==1){ // make all ele of that row to 1
                    for(int j=1;j<c;j++) mat[i][j]=1;
                }
            }
    }
    public static void modifyingCols(int [][]mat, int r, int c){
        for(int j=1;j<c;j++){
            if(mat[0][j]==1){ // make ele of that col to 1;
                for(int i=1;i<r;i++) mat[i][j]=1;
            }
        }
        
    }
    public static void modifyTheMatrix(int r, int c, int mat[][]){
        boolean row=false; // to keep track whether, first row nd col has atleast one zero or not
        boolean col=false;
        for(int i=0;i<c;i++){
            if(mat[0][i]==1){
                row=true;
            }
        }
        for(int j=0;j<r;j++){
            if(mat[j][0]==1){
                col=true;
            }
        }
        // REMEMBER AFTER THIS WE HAVE TO CONSIDER FROM 1ST ROW ND 1ST COL ONLY
        for(int i=1;i<r;i++){
             for(int j=1;j<c;j++){
                 if(mat[i][j]==1){
                     mat[0][j]=1; // indication to make jth col to zero's
                     mat[i][0]=1; // indication to make ith row to zero's
                 }
             }
        }
        modifyingRows(mat,r,c);
        modifyingCols(mat, r, c);
        if(row){
            for(int j=0;j<c;j++) mat[0][j]=1;
        }
        if(col){
            for(int i=0;i<r;i++) mat[i][0]=1;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        modifyTheMatrix(r,c,mat);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int mat[][], int r, int c){
        int temp=mat[r][c];
        mat[r][c]=mat[c][r];
        mat[c][r]=temp;
    }
    public static void transposeMatrix(int [][]mat, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(mat, i, j); // swapping
            }
        }
        // printing matrix
        for(int arr[]:mat){
            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }
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
        transposeMatrix(mat,n);
        
    }
}

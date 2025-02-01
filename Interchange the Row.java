import java.io.*;
import java.util.*;

public class Solution {
    public static void interchangeRows(int [][]mat, int c, int r){
        // exchange first nd last row corresponding elements
        for(int i=0;i<c;i++){
            int temp=mat[0][i];
            mat[0][i]=mat[r-1][i];
            mat[r-1][i]=temp;
        }
        // printing
        for(int arr[]:mat){
            for(int n:arr){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt(); // rows 
        int n=scn.nextInt(); // cols
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        interchangeRows(mat,n,m);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

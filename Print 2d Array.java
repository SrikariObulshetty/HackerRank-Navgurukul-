import java.io.*;
import java.util.*;

public class Solution {
    public static void printMatrix(int [][]mat){
        for(int arr[]:mat){
            for(int n:arr){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // rows
        int m=scn.nextInt(); // columns
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        
        printMatrix(mat);
        
    }
}

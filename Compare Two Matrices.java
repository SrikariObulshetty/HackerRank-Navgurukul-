import java.io.*;
import java.util.*;

public class Solution {
    public static String compare(int m1, int n1, int [][]mat1, int m2, int n2, int mat2[][]){
         if(m1!=m2 || n1!=n2){
             return "Not Same";
         }
         for(int i=0;i<m1;i++){
             for(int j=0;j<n1;j++){
                 if(mat1[i][j] != mat2[i][j]){
                     return "Not Same";
                 }
             }
         }
         return "Same";
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int m1=scn.nextInt(); // mat1 rows
        int n1=scn.nextInt(); // mat1 cols
        int mat1[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                mat1[i][j]=scn.nextInt();
            }
        }
        
        int m2=scn.nextInt(); // mat2 rows
        int n2=scn.nextInt(); // mat2 cols
        int mat2[][]=new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                mat2[i][j]=scn.nextInt();
            }
        }
        System.out.println( compare(m1,n1,mat1, m2, n2, mat2) );
    }
}

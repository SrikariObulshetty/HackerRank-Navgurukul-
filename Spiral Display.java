import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void spiralMatrix(int[][] mat, int r, int c){
        int count=r*c;
        int sr=0, sc=0;
        int dr=r-1, dc=c-1;
        while(count>0){
            for(int i=sr;i<=dr && count>0;i++){
                System.out.println(mat[i][sc]);
                count--;
            }
            sc++;
            for(int i=sc;i<=dc && count>0;i++){
                System.out.println(mat[dr][i]);
                count--;
            }
            dr--;
            for(int i=dr;i>=sr && count>0;i--){
                System.out.println(mat[i][dc]);
                count--;
            }
            dc--;
            for(int i=dc;i>=dr && count>0;i--){
                System.out.println(mat[sr][i]);
                count--;
            }
            sr++;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();//rows
        int m=scn.nextInt();//cols
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        spiralMatrix(arr,n,m);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

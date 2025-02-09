import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSafe(int cb[][], int r, int c){
        // check all 8 dirs;
        for(int i=0;i<c;i++){
            if(cb[r][i]==1 && i!=c){
                return false; // both sides of rows.
            }
        }
        for(int j=0;j<r;j++){
            if(cb[j][c]==1 && j!=r){ // above nd below of same coln
                return false;
            }
        }
        for(int i=r-1, j=c-1; i>=0 && j>=0 ; i--,j--){
            if(cb[i][j]==1){
                return false;
            }
        }
        for(int i=r+1,j=c+1;i<cb.length && j<cb[0].length; i++,j++){
            if(cb[i][j]==1){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<cb[0].length;i--,j++){
             if(cb[i][j]==1){
                 return false;
             }
        }
        for(int i=r+1, j=c-1; i<cb.length && j>=0;i++,j--){
            if(cb[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static String nqueensCheck(int [][]cb, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(cb[i][j]==1){
                    if(isSafe(cb, i, j)==false){
                        return "Danger";
                    }
                }
            }
        }
        return "N Queens";
    }

    public static void main(String[] args) {
         Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println(nqueensCheck(arr,n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

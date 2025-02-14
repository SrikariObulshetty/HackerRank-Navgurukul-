import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



 /* 25 2 13 8 23 
    12 7 24 3 14 
    1 18 15 22 9 
    6 11 20 17 4 
    19 16 5 10 21 */ 
    
    
public class Solution {
    public static void print(int cb[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(cb[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void knightsTour(int cb[][], int r, int c, int count, int n){
        if(r<0 || r>=n || c<0 || c>=n || cb[r][c]!=0) {
                return;
        }
        else if(count == n*n){
            cb[r][c]=n*n;
            //print.
            print(cb,n);
            cb[r][c]=0;
            return;
        }
        cb[r][c]=count;
        // check in all 8 directions.
        knightsTour(cb, r-2, c+1, count+1, n);
        knightsTour(cb, r-1, c+2, count+1, n);
        knightsTour(cb, r+1, c+2, count+1, n);
        knightsTour(cb, r+2, c+1, count+1, n);
        
        knightsTour(cb, r+2,c-1, count+1, n);
        knightsTour(cb, r+1, c-2, count+1, n);
        knightsTour(cb, r-1, c-2, count+1, n);
        knightsTour(cb, r-2, c-1, count+1, n); 
        cb[r][c]=0;   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();
        int c=scn.nextInt();
        int cb[][]=new int[n][n];
        knightsTour(cb, r, c, 1,n);
        
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static String saddlePrice(int arr[][], int n, int r){
        if(r==n){
            return "Invalid input";
        }
        int min=Integer.MAX_VALUE;
        int col=-1;
        for(int j=0;j<n;j++){
            if(min > arr[r][j]){
               min=arr[r][j];
               col=j; 
            }   
        }
        // check if the min int this row is max in that col or not
        int i=0;
        for(i=0;i<n;i++){
            if( arr[i][col] > min){
                break;
            }
        }
        if(i==n){
            return min+" ";
        }
        return saddlePrice(arr, n, r+1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println(saddlePrice(arr,n, 0));
    }
}

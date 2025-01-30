import java.io.*;
import java.util.*;

public class Solution {
    public static void chart(int arr[], int n){
         int cols=n;
         int row=Integer.MIN_VALUE; // rows= max no in array
         for(int p:arr){
             row=Math.max(row, p);
         }
         for(int r=row;r>0;r--){
             for(int c=0;c<cols;c++){
                 if(arr[c]<r){
                     System.out.print("  ");
                 }
                 else{
                     System.out.print("* ");
                 }
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        chart(arr,n);
    }
}

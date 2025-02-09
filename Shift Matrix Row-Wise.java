import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(int arr[], int l, int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public static void shiftTheMatrix(int arr[][],int n,int k){
        for(int i=0;i<n;i++){
           reverse(arr[i],0,n-1);
           reverse(arr[i],0,k-1);
           reverse(arr[i],k,n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k=scn.nextInt();
        k--;
        shiftTheMatrix(arr,n,k);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int arr[], int l, int h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;    
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort012(int arr[], int n){
        /* 0 to i-1 -> 0's
           i to j -> 1's
           j+1 to k -> unsorted
           k+1 to n -> 2's
        */
        
        int i=0, j=0, k=n-1;
        while(j<=k){
            if(arr[j]==0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[j]==2){
                swap(arr, k, j);
                k--;
            }
            else{ // arr[j]==1
                j++;
            }
        }
        printArray(arr, n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        sort012(arr, n);
    }
}

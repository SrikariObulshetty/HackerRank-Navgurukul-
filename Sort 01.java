import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort01s(int arr[], int n){
        int i=0, j=0;
        while(j<n){
            if(i!=j && arr[j]==0){
                // swap i nd j
               
                /* arr[j]=1;
                arr[i]=0; */  // this should not be done, coz if i nd j r equal nd arr[i] is '0', this will give errors.
                int temp=arr[i]; 
                arr[i]=arr[j];
                arr[j]=temp; 
                i++;
            }
            j++;
        }
        printArray(arr, n);
     
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        sort01s(arr, n);
    }
}

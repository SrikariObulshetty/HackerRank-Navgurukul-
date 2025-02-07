import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }  
    }
    public static void insertionSort(int arr[], int n){
        for(int i=0;i<n;i++){
            int ele=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > ele){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=ele;
        }
        printArray(arr, n);   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        insertionSort(arr, n);
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        } 
    }
    public static void selectionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if( arr[min] > arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                // swap.
                swap(arr, i, min);
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
        selectionSort(arr, n);
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static int partition(int arr[], int l, int h){
         int i=l, j=l;
         int pivot =arr[h];
         while(i<h){
             if(arr[i]<=pivot){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 j++;
             }
             i++;
         }
         int temp=arr[j];
         arr[j]=pivot;
         arr[h]=temp;
         return j;
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void quickSort(int arr[], int l, int h){
        if(l>=h){
            return;
        }
        int idx=partition(arr,l, h);
        quickSort(arr, l, idx-1);
        quickSort(arr, idx+1, h);     
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        quickSort(arr, 0,n-1);
        printArray(arr, n);
    }
}

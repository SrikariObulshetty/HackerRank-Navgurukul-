import java.io.*;
import java.util.*;

public class Solution {
    public static int findMax(int arr[], int n){
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             max=Math.max(arr[i], max);
         }
         return max;   
    }
    public static void kLargestElements(int arr[], int n, int k){
        int max=findMax(arr, n);
        int ans[]=new int[k];
        int idx=k-1;
        int temp=k;
        int freq[]=new int[max + 1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=max;i>=0;i--){
            while(k>0 && freq[i]>0){
                ans[idx--]=i;
                k--;
                freq[i]--;
            }
        }
        printArray(ans, temp);   
    }
    public static void printArray(int ans[], int k){
        for(int i=0;i<k;i++){  
             System.out.println(ans[i] );
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
        int k=scn.nextInt();
        kLargestElements(arr, n, k);
    }
}

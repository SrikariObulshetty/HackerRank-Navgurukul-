import java.io.*;
import java.util.*;

public class Solution {
    public static int findMax(int arr[], int n){
         int max=Integer.MIN_VALUE;
         int idx=-1;
         for(int i=0;i<n;i++){
             if(max < arr[i]){
                 max=arr[i];
                 idx=i;
             }
         }
         arr[idx]=Integer.MIN_VALUE;
         return max;   
    }
    public static void kLargestElements(int arr[], int n, int k){
        int ans[]=new int[k];
        int idx=0;
        for(int i=0;i<k;i++){
            ans[idx++]=findMax(arr, n);
        }
        Arrays.sort(ans);
        printArray(ans, k);
    }
    public static void printArray(int arr[], int k){
         for(int i=0;i<k;i++){
             System.out.println(arr[i]);
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

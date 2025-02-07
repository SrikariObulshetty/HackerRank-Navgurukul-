import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void countSort(int arr[], int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int k:arr){
            max=Math.max(max, k);
            min=Math.min(min, k);
        }
        int pos[] = new int[max+1];
        int neg[] = new int[Math.abs(min) + 1];
        for(int k:arr){
            if(k<0){
                neg[Math.abs(k)]++;
            }
            else{
                pos[k]++;
            }
        }
        int idx=0;
        for(int i=neg.length-1;i>0;i--){
            while(neg[i] > 0){
                arr[idx++]=-i;
                neg[i]--;
            }
        }
        for(int i=0;i<pos.length;i++){
            while(pos[i] > 0){
                arr[idx++]=i;
                pos[i]--;
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
        countSort(arr, n);
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void sortKSorted(int arr[], int n, int k){
        //MIN-HEAP
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int idx=0;
        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
            if(pq.size() > k){
                arr[idx++]=pq.poll();
            }
        }
        while(pq.size() > 0){
            arr[idx++]=pq.poll();
        }
    }
    
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
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
        sortKSorted(arr, n, k);
        printArray(arr, n);
        
    }
}

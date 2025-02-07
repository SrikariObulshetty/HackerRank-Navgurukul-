import java.io.*;
import java.util.*;

public class Solution {
    public static void mergeSort(int arr[], int l, int h){
        if(l>=h){ // only one or no ele left.
            return;
        } 
        int mid = (l+h)/2;
        mergeSort(arr, l, mid); // left part
        mergeSort(arr, mid+1, h); // right part
        merge(arr, l, mid, h);   
    }
    public static void addEle(int arr[], int array[], int l, int h){
        int idx=0;
        for(int i=l;i<=h;i++){
            array[idx++]=arr[i];
        }   
    }
    public static void merge(int arr[], int l, int mid, int h){
        int l1=mid-l+2;
        int r1=h-mid+1;
        int left[]=new int[l1];
        left[l1-1]=Integer.MAX_VALUE; // to reduce while loops
        int ryt[]=new int[r1];
        ryt[r1-1]=Integer.MAX_VALUE;
        // adding elements into left array
        addEle(arr, left, l ,mid);

        // addEle into ryt array
        addEle(arr, ryt, mid+1, h);
        
        int i=0, j=0, k=l;
        while(k <= h ){ // mistake is in this , dont't give k<h-l+1, give k<=h , cos starting it from 'l' na
            if(left[i] < ryt[j]){
                arr[k]=left[i];
                i++;
            } 
            else{
                arr[k] = ryt[j];
                j++;
            }   
            k++;
        }   
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        mergeSort(arr, 0, n-1);
        printArray(arr, n);   
    }
}

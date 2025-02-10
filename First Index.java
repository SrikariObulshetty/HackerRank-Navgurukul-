import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int search(int arr[], int n, int x, int idx){
        if(idx==n){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        return search(arr,n,x,idx+1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        System.out.println( search(arr, n, x,0));
        
    }
}

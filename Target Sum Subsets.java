import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void tss(int arr[],int sum,int idx,String ans,int tar){
       if(sum==tar){
           System.out.println(ans+".");
           return;
       }
        if(sum>tar || idx==arr.length){
            return;
        }
        // take
        tss(arr, sum+arr[idx], idx+1, ans+arr[idx]+", ", tar);
        /// not take
        tss(arr, sum, idx+1, ans, tar);
    }
   

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        tss(arr,0,0,"",tar);
                                                                
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

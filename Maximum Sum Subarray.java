import java.io.*;
import java.util.*;

public class Solution {
    public static void maxSubArray(int arr[], int n){
        // KADANE'S ALGORITHM
        int sum=0;
        int max=Integer.MIN_VALUE; // don't start max with '0', coz if all neg's are there
        for(int i=0;i<n;i++){       // then max will return as '0', wch is wrong
            sum+=arr[i];
            max=Math.max(max, sum);
            if(sum < 0){ // it will not contributr to max sum anymore
                sum=0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        maxSubArray(arr, n);
    }
}

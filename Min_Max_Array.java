import java.io.*;
import java.util.*;

public class Solution {
    public static int span(int arr[]){
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          for(int n:arr){
              max=Math.max(n, max);
              min=Math.min(n, min);
          }
          return max-min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println( span(arr));
    }
}

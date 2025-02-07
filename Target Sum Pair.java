import java.io.*;
import java.util.*;

public class Solution {
    public static void targetSum(int arr[], int n, int target){
      // optimal, Two Pointers
          Arrays.sort(arr);
          int i=0, j=n-1;
          while(i<j){
              int sum=arr[i] + arr[j];
              if(sum==target){
                  System.out.println(Math.min(arr[i], arr[j]) + " " + Math.max(arr[i], arr[j]));
                  i++;
                  j--;
              }
              else if(sum>target){
                  j--;
              }
              else{ // sum < target
                  i++;
              }
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
        int target=scn.nextInt();
        targetSum(arr, n, target);
    }
}

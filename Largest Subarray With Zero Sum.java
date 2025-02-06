import java.io.*;
import java.util.*;

public class Solution {
    public static void largestZeroSumSubArray(int arr[], int n){
          HashMap<Integer, Integer>map=new HashMap<>();
          int sum=0;
          int max=0;
          for(int j=0;j<n;j++){
              sum+=arr[j];
              if(sum==0){
                  max=j+1; // here, it is j+1 only
              }
              else if(map.containsKey(sum)){
                   max=Math.max( max, j-map.get(sum)); // here it is j-map.get(sum) only
              }
              else{
                  map.put(sum, j);
              }
              // map.put(sum, j); , should not keep it here, not crct we're updating idx of sum if it is found in map                   // also
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
        largestZeroSumSubArray(arr, n);
    }
}

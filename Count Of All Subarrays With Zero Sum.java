import java.io.*;
import java.util.*;

public class Solution {
    public static void count0SumSubArrays(int arr[], int n){
        int count=0;
        int sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum , map.getOrDefault(sum, 0) + 1); 
        }
        System.out.println(count);   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        count0SumSubArrays(arr, n);
    }
}

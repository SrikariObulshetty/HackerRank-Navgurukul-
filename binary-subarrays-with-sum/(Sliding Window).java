import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int binarySubArrays(int arr[], int n, int goal){
         int i=0;
        int ans=0;
        int sum=0;
        if(goal<0){    // if goal is given as 0 then goal-1 is 1, whose ans is 0
           return 0;     // but if we don't stop that loop will end up giving a wrong answer   
        }
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>goal){
                sum-=arr[i++];
            }
            ans+=(j-i+1); // for this many subarrays , sum<=goal
        }
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int goal=scn.nextInt();
        int ans1=binarySubArrays(arr, n, goal);
        int ans2=binarySubArrays(arr, n, goal-1);
        System.out.println(ans1 - ans2);
        
        
    }
}

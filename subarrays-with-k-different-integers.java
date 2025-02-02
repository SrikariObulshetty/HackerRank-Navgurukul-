import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int atmost(int k, int arr[], int n){
         if(k<0){
             return 0;
         }
         HashMap<Integer,Integer>map=new HashMap<>();
         int i=0,ans=0;
         for(int j=0;j<n;j++){
             map.put(arr[j], map.getOrDefault(arr[j],0) + 1 ); // map.getOrDefault is not present in java7 or lower 
             while(map.size()>k){                               // version so use java8
                 map.put(arr[i], map.get(arr[i])-1);
                 if(map.get(arr[i])==0){
                     map.remove(arr[i]);
                 }
                 i++;
             }
             ans+=j-i+1;
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
        int k=scn.nextInt();
        int ans1=atmost(k,arr,n);
        int ans2=atmost(k-1,arr, n);
        System.out.println(ans1-ans2);
    }
}

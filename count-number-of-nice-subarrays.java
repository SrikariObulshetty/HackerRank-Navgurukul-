import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int atmost(int arr[], int n, int k){
         if(k<0){
             return 0; 
         }
         int i=0,odds=0,ans=0;
         for(int j=0;j<n;j++){
             odds+=arr[j]%2; // way of writing this condition is SOOOOOOOOO....... good , I liked it really
             while(odds>k){
                 odds-=arr[i++]%2; // this condin write in a crct way
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
        int ans1=atmost(arr,n,k);
        int ans2=atmost(arr,n,k-1);
        System.out.println(ans1-ans2);
    }
}

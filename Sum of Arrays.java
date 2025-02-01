import java.io.*;
import java.util.*;

public class Solution {
    public static void sumOfArrays(int a1[], int n1, int a2[], int n2){
          // max size of res arr is max(n1, n2) + 1;
         int n=Math.max(n1,n2) +1;
          int res[]=new int[n];
          int i=n1-1, j=n2-1, k=n-1;
          int sum=0;
          while(i>=0 || j>=0){
              if(i>=0){
                  sum+=a1[i];
                  i--;
              }
              if(j>=0){
                  sum+=a2[j];
                  j--;
              }
              res[k--]=sum%10;
              sum=sum/10;
          }
          // if carry is leftover
        res[k--]=sum;
        // removing trailing zeros
        int idx=0;
        while(idx<n && res[idx]==0){
            idx++;
        }
        if(idx==n){
            // zero is resultant
            System.out.println(0);
            return;
        }
        for(;idx<n;idx++){
            System.out.println(res[idx]);
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int a1[]=new int[n1];
        // a1 input elements
        for(int i=0;i<n1;i++){
            a1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int a2[]=new int[n2];
        // a2 input elements
        for(int i=0;i<n2;i++){
            a2[i]=scn.nextInt();
        }
        sumOfArrays(a1, n1, a2, n2);
    }
}

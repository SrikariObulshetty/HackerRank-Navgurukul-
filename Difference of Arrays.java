import java.io.*;
import java.util.*;

public class Solution {
    public static void diffArrays(int a1[], int n1, int a2[], int n2){
          int res[]=new int[n2]; //max possible size of diff array
          int i=n1-1, j=n2-1, k=j;
          while(i>=0 && j>=0){
              if(a1[i]<=a2[j]){
                  res[k--]=a2[j]-a1[i];
                  j--;
                  i--;
              }
              else{ // take borrrowing 
                  a2[j-1]-=1;
                  res[k--]=a2[j]+10-a1[i];   
                  j--;
                  i--;
              }
          }
        while(j>=0){
            res[k--]=a2[j];
            j--;
        }
        // removing trailing zeros;
        int idx=0;
        while(idx<n2 && res[idx]==0){
            idx++;
        }
        if(idx==n2){
            System.out.println(0);
        }
        for(; idx<n2;idx++){
            System.out.println(res[idx]);
        }
          
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=scn.nextInt();
        }
        diffArrays(a1,n1,a2,n2);  
        
    }
}

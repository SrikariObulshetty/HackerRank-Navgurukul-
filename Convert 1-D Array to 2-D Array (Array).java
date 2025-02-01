import java.io.*;
import java.util.*;

public class Solution {
    public static void convert2D(int arr[], int r,int c){
         int idx=0;
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 System.out.print(arr[idx++]+" ");
             }
             System.out.println();
         }   
    }
  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int p=scn.nextInt();
        int q=scn.nextInt();
        convert2D(arr,p,q);
          
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

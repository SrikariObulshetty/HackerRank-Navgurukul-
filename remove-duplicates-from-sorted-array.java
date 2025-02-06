import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int arr[], int i, int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    public static int removeDup(int arr[], int n){
         int i=0, j=0;
         while(j<n){
            if(arr[i]!=arr[j]){
                swap(arr, ++i, j);
            }
            j++;
         }
         return i+1;    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=scn.nextInt();
        }
        System.out.println( removeDup(arr, n) );
        
    }
}

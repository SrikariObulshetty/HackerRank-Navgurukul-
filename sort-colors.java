import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int []colors, int n1, int n2){
        int temp=colors[n1];
        colors[n1]=colors[n2];
        colors[n2]=temp;
    }
    public static void sortColors(int []colors, int n){
         int i=0, j=0, k=n-1;
          // DUTCH NATIONAL FLAG ALGORITHM.
         // logic is:
        // 0 to i-1 -> red or zero's.
        // i+1 to j -> 1's or white.
        // j+1 to k -> processed.
        // k+1 to n-1 -> 2's or blue.
        while(j<=k){
            if(colors[j]==0){
                // swap i, j
                swap(colors, i, j);
                i++;
                j++;
            }
            else if(colors[j]==2){
                // swap with 'k'
                swap(colors, j, k);
                k--;
            }
            else{ // colors[j]==1
                j++;
            }
        }
    }
    
    public static void printArray(int colors[], int n){
        for(int i=0;i<n;i++){
            System.out.print(colors[i]+" ");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int colors[]=new int[n];
        for(int i=0;i<n;i++){
            colors[i]=scn.nextInt();
        }
        sortColors(colors, n);
        printArray(colors, n);
    }
}

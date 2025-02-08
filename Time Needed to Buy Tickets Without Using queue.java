import java.io.*;
import java.util.*;

public class Solution {
    public static void timeTaken(int arr[], int n, int k){
        int i=0, time=0;
        while(arr[k] != 0){
            if(arr[i]!=0){
                time++;
                arr[i]--;
            }
            i= (i+1) % n;
        }
        System.out.println( time);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k=scn.nextInt();
        timeTaken(arr, n, k);
    }
}

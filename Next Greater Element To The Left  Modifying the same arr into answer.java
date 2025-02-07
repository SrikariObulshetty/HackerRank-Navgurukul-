import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void nextGrterLeft(int []arr, int n){
         if(n==0){
             return;
         }
         Stack<Integer> st = new Stack<>();
         st.push(arr[0]);
         arr[0]=-1;
         for(int i=1;i<n;i++){
             int ele=arr[i];
             while(!st.isEmpty() && arr[i] >= st.peek() ){
                 st.pop();
             }
             if(st.isEmpty()){
                 arr[i]=-1;
             }
             else{
                 arr[i]=st.peek();
             }
             st.push(ele);
         }
         printArray(arr, n);  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        nextGrterLeft(arr, n);
    }
}

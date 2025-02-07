import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void nextGrter(int arr[], int n){
        if(n==0){
            return;
        }
        Stack<Integer> st= new Stack<>();
        st.push(arr[n-1]);
        arr[n-1]=-1;
         // last element has no grter element.
        
        for(int i=n-2;i>=0;i--){
            int ele=arr[i];
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                arr[i]=st.peek();
            }
            else{
                arr[i]=-1;
            }
            st.push(ele);
        }
        printArray(arr, n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        nextGrter(arr, n);
    }
}

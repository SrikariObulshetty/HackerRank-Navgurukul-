import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void allIndices(int arr[], int n, int x, ArrayList<Integer>al, int idx){
           if(idx==n){
               return;
           }
           if(arr[idx]==x){
               al.add(idx);
           }
           allIndices(arr, n, x, al, idx+1);
        
        
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        allIndices(arr, n, x, al,0);
        int ans[] = new int[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
            System.out.println(ans[i]);
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static int kDiffSubArrays(int arr[], int n, int k){
        if(k<0){
            return 0;
        }
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        for(int j=0;j<n;j++){
           map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
           while(map.size()>k){
               map.put(arr[i], map.get(arr[i])-1 );
               if(map.get(arr[i])==0){
                   map.remove(arr[i]);
               }
               i++;
           }
           count+=j-i+1;
        }
        return count;   
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
        int atmost= kDiffSubArrays(arr, n, k);
        int oneLessatmost=kDiffSubArrays(arr, n, k-1);
        System.out.println( atmost - oneLessatmost );
    }
}

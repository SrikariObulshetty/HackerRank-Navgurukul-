import java.io.*;
import java.util.*;

public class Solution {
    public static int[] twoSum(int arr[], int n, int target){
        int ans[]=new int[2];
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]+arr[j] == target){
                ans[0]=++i;
                ans[1]=++j;
                return ans;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        int ans[]=twoSum(arr, n, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}

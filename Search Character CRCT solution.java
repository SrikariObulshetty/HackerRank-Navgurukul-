import java.io.*;
import java.util.*;

public class Solution {
    public static int binarySearch(char arr[], int l, int h, char c, char ans){
        if(l>h){
            if(ans!=' '){
                System.out.println(ans);
                return 1;
            }
            return -1;
        }
        int mid=(l+h)/2;
        if(arr[mid] > c){
            return binarySearch(arr, l, mid-1, c,arr[mid]);
        }
        else{
            return binarySearch(arr, mid+1, h, c,ans);
        }
    }
    public static void searchChar(char arr[], int n, char c){
        int res=binarySearch(arr,0,n-1,c,' ');
        if(res==-1){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char c=scn.next().charAt(0);
        int n=scn.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        searchChar(arr, n, c);
    }
}

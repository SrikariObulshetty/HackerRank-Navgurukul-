import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPal(int arr[], int c){
        for(int i=0;i<c/2;i++){
            if(arr[i]!=arr[c-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void palRows(int [][]mat, int r, int c){
        int count=0;
        for(int i=0;i<r;i++){
            if(isPal(mat[i], c)){
                count++;
            }
        }
        System.out.println(count); 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        palRows(mat, r, c);
    }
}

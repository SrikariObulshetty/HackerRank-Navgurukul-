import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isSafe(int []cb, int cr,int cc){
        // checking 3 dir's only
        for(int i=cr-1;i>=0;i--){
            if(cb[i]==cc || (Math.abs(cr-i) == Math.abs(cc-cb[i])) ){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(int cb[], int n, int cr){
        if(cr==n){ // reached end, need to check whether we have an answer or not
            for(int i=0;i<n;i++){
                if(cb[i]==-1){
                    return;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(i+"-"+cb[i]+", ");
            }
            System.out.println(".");
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(cb, cr, i)==true){
                cb[cr]=i;
                nQueens(cb, n, cr+1);
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int cb[] = new int[n];
        Arrays.fill(cb, -1);
        nQueens(cb, n, 0);
    }
}

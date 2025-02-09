import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void rotationCheck(int [][]mat, int n){
        String str="";
        for(int i=0;i<n;i++){
            str+=mat[0][i];
        }
        str+=str; // MAIN LOGIC
        for(int i=1;i<n;i++){
            String curr="";
            for(int j=0;j<n;j++){
                curr+=mat[i][j];
            }
            if(str.indexOf(curr)==-1){ // not valid circular rotation.
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        rotationCheck(mat, n);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void floodFill(int [][]mat, int cr, int cc, int dr, int dc, String ans){
        if(cr<0 || cr>dr || cc<0 || cc>dc || mat[cr][cc]==1){
            return;
        }
        if(cr==dr && cc==dc){
            System.out.println(ans);
            return;
        }
        mat[cr][cc]=1;
          // top
        floodFill(mat, cr-1, cc, dr, dc, ans+"t");
          //left
        floodFill(mat, cr, cc-1, dr, dc, ans+"d");
         // down
        floodFill(mat, cr+1, cc, dr, dc, ans+"d");
        // right;
        floodFill(mat, cr, cc+1, dr, dc, ans+"r");
        mat[cr][cc]=0;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt(); // rpows
        int c=scn.nextInt(); // cols
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        floodFill(mat, 0, 0, r-1, c-1, "");
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static int matrixMultiplication(int [][]a1, int [][]a2, int n1, int m1, int n2, int m2){
           if(m1!=n2){
               return 0;
           }
           for(int i=0;i<n1;i++){
               for(int j=0;j<m2;j++){
                   int temp=0;
                   for(int k=0;k<m1;k++){
                       temp+=  a1[i][k]*a2[k][j];
                   }
                   System.out.print(temp+" ");
               }
               System.out.println();
           }  
           return 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int a1[][]=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                a1[i][j]=scn.nextInt();
            }
        }
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int a2[][]=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                a2[i][j]=scn.nextInt();
            }
        }
        int res=matrixMultiplication(a1,a2,n1,m1,n2,m2);
        if(res==0){
            System.out.println("Invalid input");
        }
    }
}

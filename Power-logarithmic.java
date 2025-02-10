import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int powerLog(int x,int n){
      if(n==0){
          return 1;
      }
      int cal=powerLog(x, n/2);
      if( (n%2)==0){
          return cal * cal;
      }
       return x * cal * cal;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(powerLog(x,n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

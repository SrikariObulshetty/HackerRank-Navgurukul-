import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int powerLinear(int x, int n){
        if(n==0){
            return 1;
        }
        return x * powerLinear(x, n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(powerLinear(x, n) );
    }
}

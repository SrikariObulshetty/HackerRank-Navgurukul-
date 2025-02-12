import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void printEnc(String s, String ans, char arr[]){
        if( s.length() ==0){
            System.out.println(ans);
            return;
        }
        int n=s.charAt(0)-'0';
        if(n==0){
            return;
        }
        printEnc(s.substring(1),  ans+arr[n], arr);
        if(s.length()>1){
            n=Integer.parseInt(s.substring(0,2));
            if(n<=26){
               printEnc(s.substring(2), ans+arr[n], arr);
            }
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        char arr[]=new char[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String s=scn.nextLine();
        printEnc(s, "", arr);
    }
}

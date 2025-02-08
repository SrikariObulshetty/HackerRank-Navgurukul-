import java.io.*;
import java.util.*;

public class Solution {
    public static void palindrome(String sub){
        int i=0, j=sub.length()-1;
        while(i<j){
            if(sub.charAt(i)!=sub.charAt(j)){
                return;
            }
            i++;
            j--;
        }
        System.out.println(sub);
        
    }
    public static void palindromeSubstrings(String s){
        int n=s.length();
        // generate all substrings
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i, j);
                palindrome(sub);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        palindromeSubstrings(s);
    }
}

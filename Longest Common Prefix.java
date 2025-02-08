import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static String longestCommonPrefix(String [] strs, int n){
        if(n==0){
            return "";
        }
        else if(n==1){
            return strs[0];
        }
         Arrays.sort(strs);
         String s=strs[0];
         String t=strs[n-1];
         int j=0;
         for(int i=0;i<s.length();i++){ // since s len <= t len
             char c1=s.charAt(i);
             char c2=t.charAt(i);
             if(c1!=c2){
                 return s.substring(0, j);
             }
             j++;
         }
         return s;
         
    }
   

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        String strs[] = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = scn.next();
        }
        System.out.println( longestCommonPrefix(strs, n) );
    }
}

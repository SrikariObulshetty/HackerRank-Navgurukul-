import java.io.*;
import java.util.*;

public class Solution {
    public static int longRepCharReplace(String s, int k){
        int n=s.length();
        int ans=0;
        // brute force -> generate all substrings
        for(int i=0;i<n;i++){
            int hash[]=new int[26];
            int maxfreq=0;
            for(int j=i;j<n;j++){
                char c=s.charAt(i);
                hash[c-'A']++;
                if(hash[c-'A'] > maxfreq){ // update maxfreq
                    maxfreq=hash[c-'A'];
                }
                int changes=j-i+1-maxfreq;
                if( changes<= k){
                    ans=Math.max(ans, j-i+1);
                }
           }
        }
        return ans;
        
         
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int k=scn.nextInt();
        System.out.println( longRepCharReplace(s, k) );   
    }

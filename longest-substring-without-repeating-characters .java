import java.io.*;
import java.util.*;

public class Solution {
    public static int longestSubString(String s){
        int n=s.length();
        int i=0, ans=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int j=0;j<n;j++){
            char c=s.charAt(j);
            map.put(c, map.getOrDefault(c,0) + 1);
            while(map.get(c) > 1){
                char c2=s.charAt(i++);
                map.put(c2, map.get(c2) - 1);
            }
            ans=Math.max(ans, j-i+1);
        }
        return ans;    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println( longestSubString(s) );
           
    }
}

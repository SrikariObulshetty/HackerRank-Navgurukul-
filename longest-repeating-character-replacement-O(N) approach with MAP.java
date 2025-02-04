import java.io.*;
import java.util.*;

public class Solution {
    public static int longRepCharReplace(String s, int k){
         int n=s.length();
         int ans=0;
         int i=0;
        int j=0;
         int maxFreq=0;
         HashMap<Character, Integer> map=new HashMap<>();
         for(;j<n;j++){
             char c=s.charAt(j);
             map.put(c, map.getOrDefault(c, 0) + 1);
             if(map.get(c) > maxFreq){
                 maxFreq=map.get(c);
             }
             while( (j-i+1)-maxFreq > k ){
                 char c1=s.charAt(i++);
                 map.put(c1, map.getOrDefault(c1, 0)-1);
                 // update maxfreq by iterating in map
                 maxFreq=0;
                 for(char key:map.keySet()){
                     maxFreq=Math.max(maxFreq, map.get(key));
                 }
             }
             ans=Math.max(ans, j-i+1);   
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
}

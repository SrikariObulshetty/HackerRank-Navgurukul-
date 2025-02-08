import java.io.*;
import java.util.*;

public class Solution {
    public static String checkIsogram(String s){
        int freq[] = new int[26];
        for(char c:s.toCharArray()){
            if(freq[c-'a'] > 0){
                return "Not an Isogram";
            }
            freq[c-'a']++;
        }
        return "Isogram";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s= scn.nextLine();
        System.out.println( checkIsogram(s) );
        
    }
}

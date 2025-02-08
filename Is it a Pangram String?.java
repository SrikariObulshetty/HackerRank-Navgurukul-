import java.io.*;
import java.util.*;

public class Solution {
    public static String checkPangram(String s){
        int freq[] = new int[26];
        for(char c:s.toCharArray()){
            if(c!=' '){
              freq[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine(); // spaces are there.
        System.out.println( checkPangram(s) );
    }
}

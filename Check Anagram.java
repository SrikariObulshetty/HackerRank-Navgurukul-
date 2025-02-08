import java.io.*;
import java.util.*;

public class Solution {
    public static void checkAnagrams(String s, String p){
        int l1=s.length();
        int l2=p.length();
        if(l1 != l2){
            System.out.println("False");
            return;
        }
        int freq[] = new int[26];
        for(int i=0;i<l1;i++){
            freq[s.charAt(i) - 'a']++;
            freq[p.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String p=scn.nextLine();
        checkAnagrams(s,p);
    }
}

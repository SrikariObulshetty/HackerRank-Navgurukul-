import java.io.*;
import java.util.*;

public class Solution {
    public static void allAnagrams(String s, String p){
        int s_l=s.length();
        int p_l=p.length();
        
        int s_freq[]=new int[26];
        int p_freq[]=new int[26];
        for(int i=0;i<p_l;i++){
            char c1=s.charAt(i);
            char c2=p.charAt(i);
            s_freq[c1-'a']++;
            p_freq[c2-'a']++;
        }
        int i=0;
        for(int j=p_l;j<s_l;j++){
            if(Arrays.equals(s_freq, p_freq) ){
                System.out.print(i+" ");
            }
            s_freq[s.charAt(i++) - 'a']--;
            s_freq[s.charAt(j) - 'a']++; 
        }   
        if(Arrays.equals(s_freq, p_freq) ){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String p=scn.nextLine();
        allAnagrams(s, p);

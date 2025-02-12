import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void addValues(HashSet<Character>set){
        for(int i=0;i<=25;i++){
            set.add((char)('a'+i));
            set.add((char)('A'+i));
        }
        
    }
    public static void reverseLetters(String s){
        HashSet<Character>set=new HashSet<>();
        addValues(set);
        String ans="";
        int i=0;
        int j=s.length()-1;
        while(j>=0){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(set.contains(c1) && set.contains(c2)){
                ans+=c2;
                j--;
                i++;
            }
            else if(!set.contains(c1)){
                ans+=c1;
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(ans);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        reverseLetters(s);
    }
}

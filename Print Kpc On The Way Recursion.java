import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void printKPC(String s, HashMap<Integer,String>map, String ans){
         if(s.length()==0){
             System.out.println(ans);
             return;
         }
         int n=s.charAt(0) - '0';
         for(int i=0;i<map.get(n).length();i++){
             char ch=map.get(n).charAt(i);
             printKPC(s.substring(1), map, ans+ch);
         }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<>();
        map.put(0, ".;");
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");
        map.put(4, "jkl");
        map.put(5, "mno");
        map.put(6, "pqrs");
        map.put(7, "tu");
        map.put(8, "vwx");
        map.put(9, "yz");
        String s=scn.nextLine();
        printKPC(s,map, "");
    }
}

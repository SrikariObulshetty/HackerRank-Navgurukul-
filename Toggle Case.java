import java.io.*;
import java.util.*;

public class Solution {
    public static void toggle(String s){
        String ans="";
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                ans+=(char)(c-'a'+'A');
            }
            else{
                ans+=(char)(c-'A'+'a');
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        toggle(s);
    }
}

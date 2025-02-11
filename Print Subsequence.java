import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // RECURSION ON THE WAY.
    public static void subSeq(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        //take
        String sub=s.substring(1);
        subSeq(sub, ans+s.charAt(0));
        // not take
        subSeq(sub, ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        subSeq(s,"");
    }
}

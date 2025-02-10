import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void subsequence(String s, ArrayList<String>ans, int idx, int n, StringBuilder sb){
        if(idx==n){
            ans.add(sb.toString());
            return;
        }
        //not take
        subsequence(s,ans,idx+1,n,sb);
        // take
        subsequence(s,ans,idx+1,n, sb.append(s.charAt(idx)));
        if(sb.length() >0){
           sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        ArrayList<String>ans=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        subsequence(s, ans, 0,s.length(), sb);
        System.out.println(ans);
    }
}

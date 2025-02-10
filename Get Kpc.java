import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static List<String> getKPC(String s,String arr[]){
        if(s.equals("")){
            List<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        int n=s.charAt(0)-'0';
        String sub=arr[n];
        List<String>subAns=getKPC(s.substring(1), arr);
        List<String>ans=new ArrayList<>();
        for(int i=0;i<sub.length();i++){
            char ch=sub.charAt(i);
            for(int j=0;j<subAns.size();j++){
                ans.add(ch + subAns.get(j) );
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        String s=scn.nextLine();
        String arr[]={".;", "abc", "def", "ghi","jkl", "mno", "pqrs", "tu", "vwx","yz"};
        System.out.println(getKPC(s, arr));
    }
}

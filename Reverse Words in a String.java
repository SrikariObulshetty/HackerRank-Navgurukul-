import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(String s){
        s=s.trim(); // removes leading nd trailing spaces
        int n=s.length();
        int i=n;
        String ans="";
        int j=0;
        for(j=n-1;j>=0;j--){
            char c=s.charAt(j);
            if(c==' '){
                if(j+1==i && s.charAt(i)==' '){
                    i--;
                    continue;
                }
                else{
                    ans+=s.substring(j+1, i)+" ";
                    i=j;
                }
            }
        }
        ans+=s.substring(0,i);
        System.out.println(ans);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        String s=scn.nextLine();
        reverse(s);
    }
}

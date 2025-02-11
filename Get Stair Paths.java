import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static ArrayList<String> getPaths(int n){
        if(n<0){
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
        else if(n==0){ // reached nth stair
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
      //  ArrayList<String>s1=getPaths(n-1);
        ArrayList<String>s2=getPaths(n-2);
        ArrayList<String>s1=getPaths(n-1);
        ArrayList<String>s3=getPaths(n-3);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<s1.size();i++){
            ans.add("1" + s1.get(i));
        }
        for(int i=0;i<s2.size();i++){
            ans.add("2" + s2.get(i));
        }
        for(int i=0;i<s3.size();i++){
            ans.add("3" + s3.get(i));
        }
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println( getPaths(n) );
    }
}

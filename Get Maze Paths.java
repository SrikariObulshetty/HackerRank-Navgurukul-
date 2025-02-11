import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static ArrayList<String> getMazePaths(int dr, int dc, int cr, int cc){
        if(cr>dr || cc>dc){
            return new ArrayList<>();
        }
        if(cr==dr && cc==dc){ // start prepsring the answer
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>hori=getMazePaths(dr, dc, cr, cc+1);
        ArrayList<String>ver=getMazePaths(dr, dc, cr+1, cc);
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<hori.size();i++){
            ans.add("h" + hori.get(i));
        }
        for(int i=0;i<ver.size();i++){
            ans.add("v" + ver.get(i));
        }
        return ans;
        
        
    }
    
    

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // rows
        int m=scn.nextInt(); // cols
         
        System.out.println( getMazePaths(n-1, m-1,  0, 0) );
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

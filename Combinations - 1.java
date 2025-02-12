import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void combinations(int boxes, int items, int itPlaced, int currBox, String ans){
        if(currBox==boxes){
            if(itPlaced==items){
                System.out.println(ans);
            }
            return;
        }
        // place in box
        combinations(boxes, items, itPlaced+1, currBox+1, ans+"i");
        // don't place
        combinations(boxes, items, itPlaced, currBox+1, ans+"-");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int it=scn.nextInt();
        combinations(b, it, 0, 0, "");
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(String s){
        Stack<Character> st=new Stack<>();
        for( char c:s.toCharArray()){
            st.push(c);
        }
        while(st.size() > 0){
            System.out.print(st.pop());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in); 
        String s=scn.nextLine();
        reverse(s);
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    public static void duplicateBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray() ){
            if(c==')'){
                if(st.peek()=='('){
                    System.out.println(true); // duplicate brackets.
                    return;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
            else{
                st.push(c);
            }   
        }
        System.out.println(false);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine(); // have to take next line only coz spaces are there.
        duplicateBrackets(s);
        
    }
}

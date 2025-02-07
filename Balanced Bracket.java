import java.io.*;
import java.util.*;

public class Solution {
    public static void balancedBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char k=st.peek();
                if( (c==')' && k!='(') || (c==']' && k!='[') || (c=='{' && k!='}') ){
                    System.out.println(false);
                    return;
                }
                st.pop();
            }
                
        }
        if(st.size() > 0){
            System.out.println(false);
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        balancedBrackets(s);
    }
}

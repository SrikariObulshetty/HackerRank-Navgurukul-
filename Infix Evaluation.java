import java.io.*;
import java.util.*;

public class Solution {
    public static int calculate(int op2, int op1, char c){
        if(c=='+') return op1 + op2;
        else if(c=='-') return op1 - op2;
        else if(c=='*') return op1 * op2;
        return op1 / op2;
    }
    public static int precedence(char c){
        if(c=='*' || c=='/') return 10;
        else if(c=='+' || c=='-') return 5;
        return 0;
    }
    public static void infixEvaluation(String s){
        Stack<Character>st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(char c: s.toCharArray()){
            if(c>='0' && c<='9'){
                st2.push(c-'0');
            }
            else{ // oprtr
                while(!st1.isEmpty() && precedence(c) <= precedence(st1.peek()) ){
                    int op1=st2.pop();
                    int op2=st2.pop();
                    st2.push( calculate(op1, op2, st1.pop()) );

                }
                st1.push(c);
            }
        }
        while(st1.size() > 0){
                st2.push(calculate(st2.pop(), st2.pop(), st1.pop()));
        }
        System.out.println(st2.peek());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        infixEvaluation(s);
    }
}

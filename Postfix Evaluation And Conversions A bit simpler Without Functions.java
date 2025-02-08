import java.io.*;
import java.util.*;

public class Solution {
    public static int calculate(int op1, int op2, char op){
        if(op=='+') return op1 + op2;
        else if(op=='-') return op1-op2;
        else if(op=='*') return op1 * op2;
        return op1 / op2;
    }
    
    public static void conversions(String postfix){
        Stack<Integer> post= new Stack<>();
        Stack<Character>oprtr=new Stack<>();
        Stack<String>pre=new Stack<>();
        Stack<String> infix=new Stack<>();
        for(char c: postfix.toCharArray()){
            if(c>='0' && c<='9'){
                pre.push(c+"");
                infix.push(c+"");
                post.push(c-'0');
            }
            else{ // oprtr.
                int op1=post.pop();
                int op2=post.pop();
                post.push(calculate(op2, op1, c));
                String s1=infix.pop();
                String s2=infix.pop();
                infix.push( '(' + s2 + c + s1 + ')' );
                s1=pre.pop();
                s2=pre.pop();
                pre.push( c+s2+s1 );  
            }
        }
        System.out.println(post.pop());
        System.out.println(infix.pop());
        System.out.println(pre.pop());    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String postfix=scn.nextLine();
        conversions(postfix);
    }
}

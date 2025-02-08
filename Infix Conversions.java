import java.io.*;
import java.util.*;

public class Solution {
    public static int precedence(char op){
        if(op=='+' || op=='-') return 5; // low priority
        else if(op=='*' || op=='/') return 10; // high priority
        return 0; // ')' || '(';
    }
    public static void postfix(Stack<String>post, char op){
         String op1= post.pop();
         String op2=post.pop();
         post.push(op2+op1+op+"");    
    }
    public static void prefix(Stack<String>pre, char op){
        String op1=pre.pop();
        String op2=pre.pop();
        pre.push(op+op2+op1+"");
    }
    
    public static void convert(String infix){
        Stack<String> post=new Stack<>();
        Stack<String> pre= new Stack<>();
        Stack<Character> oprtr= new Stack<>();
        for( char c : infix.toCharArray()){
            if(c>='a' && c<='z'){
                post.push(c+""); // adding digits to both expressions
                pre.push(c+"");
            }
            else if(c=='('){
                oprtr.push('(');
            }
            else if(c==')'){
                while(!oprtr.isEmpty() && oprtr.peek()!='(' ){
                     // create expressions.
                    // postfix.
                    char opr=oprtr.pop();
                    postfix(post, opr);
                    prefix(pre, opr);
                }
                oprtr.pop();
            }
            else{ // it is an oprtr
                while(!oprtr.isEmpty() && precedence(c) <= precedence(oprtr.peek())){
                    char opr=oprtr.pop();
                    postfix(post,opr);
                    prefix(pre, opr);
                }
                oprtr.push(c);
            }
            
        }
        while(!oprtr.isEmpty()){
            char opr=oprtr.pop();
            postfix(post, opr);
            prefix(pre, opr);
            
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String infix=scn.nextLine();
        convert(infix);
    }
}

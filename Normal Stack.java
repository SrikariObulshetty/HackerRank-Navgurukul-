import java.io.*;
import java.util.*;

public class Solution {
    public static class Stack{
        int arr[];
        int tos;
        public Stack(int n){ // cpnstructor.
            arr=new int[n];
            tos=-1;
        }
        public void push(int val){
            if(tos==arr.length-1){
                System.out.println("Stack overflow");
            }
            else{
                arr[++tos]=val;
            }
        }
        public int pop(){
            if(tos==-1){ // stack is emtpy
               System.out.println("Stack underflow");
               return -1; 
            }
            else{
                return arr[tos--];
            }
        }
        public int top(){
            if(tos==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                return arr[tos];
            }
        }
        public int size(){
            return tos+1;
        }
        public void display(){
            for(int i=tos;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
           
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        Stack st = new Stack(n); // creating object
        String s=scn.next(); // don't give next line coz, for push it will take ele also if we give nextLine
        int res=0;
        while(!s.equals("quit")){
                if(s.equals("push") ){
                    res=scn.nextInt();
                    st.push(res);
                }
                else if(s.equals("pop")){
                    res=st.pop();
                    if(res!=-1){
                        System.out.println(res);
                    }
                }
                else if(s.equals("top")){// peek
                    res=st.top();
                    if(res!=-1){
                        System.out.println(res);
                    } 
                }
                else if(s.equals("size")){
                    System.out.println(st.size());
                }
                else{
                    st.display();
                }
            s=scn.next();
        }
    }
}

import java.io.*;
import java.util.*;


class CustomStack{
      int arr[];
      int tos;
      int n;
      CustomStack(int n){
          this.n=n;
          arr= new int[this.n];
          tos=-1;
      }
      public void push(int val){
          if(tos==n-1){
              // increasing capacity.
              n+=n; // doubling the capacity.
              int newArr[]= new int[n];
              for(int i=0;i<arr.length;i++){
                  newArr[i] = arr[i];
              }
              arr=newArr; // old array points to new Array.
          }
          arr[++tos]=val;
      }
      public int pop(){
          if(tos==-1){
              System.out.println("Stack underflow");
              return -1;
          }
          return arr[tos--];
      } 
      public int top(){
          if(tos==-1){
              System.out.println("Stack underflow");
              return -1;
          }
          return arr[tos];
      }
      public int size(){
          return tos + 1;
      }
      public void display(){
          for(int i=tos;i>=0;i--){
              System.out.print(arr[i] + " ");
          }
          System.out.println();
      }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        // creating obj of custom class.
        CustomStack st= new CustomStack(n);
        String s="";
        int res=0;
        while(scn.hasNext()){
            s=scn.next(); // not next line
            if(s.equals("push")){
                res=scn.nextInt();
                st.push(res);
            }
            
            else if(s.equals("pop")){
                res=st.pop();
                if(res!=-1){
                    System.out.println(res);
                }
            }
            else if(s.equals("top")){
                res=st.top();
                if(res!=-1){
                    System.out.println(res);
                }
            }
            else if(s.equals("size")){
                System.out.println(st.size());
            }
            else if(s.equals("display")){
                st.display();
            } 
            else{ // "quit"
                break;
            }     
        }
    }
}

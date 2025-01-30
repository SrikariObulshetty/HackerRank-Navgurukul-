import java.io.*;
import java.util.*;

public class Solution {
    public static void checkType(char c){
          if(Character.isLowerCase(c)){
              System.out.print("Small case");
          }
          else if(Character.isUpperCase(c)){
              System.out.println("Upper case");
          }
          else if(Character.isDigit(c)){
              System.out.print("Digit");
          }
          else{
              System.out.println("None");
          }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        char c=scn.next().charAt(0);
        checkType(c);
    }
}

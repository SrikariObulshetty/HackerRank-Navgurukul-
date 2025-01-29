import java.io.*;
import java.util.*;

public class Solution {
    public static void toggle(char c){
         if(Character.isLowerCase(c)==true){
             System.out.println((char)(c-'a'+'A') );
         }
        else{
            System.out.println((char) (c-'A'+'a'));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        char c=scn.next().charAt(0);
        toggle(c);
    }
}

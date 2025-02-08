import java.io.*;
import java.util.*;

public class Solution {
    public static void compression(String s){
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int count=1;
        sb1.append(s.charAt(0));
        sb2.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            char k=sb1.charAt(sb1.length()-1);
            if(c==k){
                count++;
            }
            else{
                sb1.append(c);
                if(count!=1){
                    sb2.append(count);
                }
                count=1;
                sb2.append(c);
            }
        }
        System.out.println(sb1);
        if(count!=1){
            sb2.append(count);
        }
        System.out.println(sb2);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        String s =scn.nextLine();
        compression(s);
    }
}

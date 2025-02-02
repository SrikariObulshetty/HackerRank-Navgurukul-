import java.io.*;
import java.util.*;

public class Solution {
    public static int distinctCharSubStrings(String s){
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        for(int j=0;j<3;j++){
            char c=s.charAt(j);
            map.put(c, map.getOrDefault(c,0) +1);
        }
        if(map.size()==3){
            count++;
        }
        for(int j=3;j<s.length();j++){
            char c1=s.charAt(j);
            char c2=s.charAt(i);
            map.put(c1, map.getOrDefault(c1,0)+1);
            map.put(c2, map.get(c2)-1);
            if(map.get(c2)==0){ // c2 is not in this window anymore...
                map.remove(c2);
            }
            i++;
            if(map.size()==3){
                count++;
            }   
        }
        return count; 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println( distinctCharSubStrings(s) );
    }

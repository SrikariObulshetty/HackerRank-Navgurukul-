import java.io.*;
import java.util.*;

public class Solution {
    public static void highFreqChar(String s){
        HashMap<Character,Integer>map=new HashMap<>();
         for(char c:s.toCharArray()){
              map.put(c, map.getOrDefault(c,0) + 1);
          }
          int maxfreq=0;
          char c='@';
          for(char key:map.keySet()){
              if(map.get(key)>maxfreq){
                  c=key;
                  maxfreq=map.get(c);    
              }    
          }
          System.out.println(c); 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        highFreqChar(s);
    }
}

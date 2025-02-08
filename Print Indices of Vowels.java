import java.io.*;
import java.util.*;

public class Solution {
    public static void printIndices(String s){
        //Set<Character> set= Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'); // this set is immutable can't,
        // will not work out 
        // modify.
        // HashSet<Character> set= new HashSet<>(Arrays.asList(  )); // mutable
        HashSet<Character> set = new HashSet<>();
        Collections.addAll(set,'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' );  // mutable
        for(int i=0;i<s.length(); i++){
            char c= s.charAt(i);
            if(set.contains(c)){
                System.out.print(i+" ");
            }
        }  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        String s=scn.nextLine();
        printIndices(s);
    }
}

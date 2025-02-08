import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        String p=scn.nextLine();
        if(s.equals(p)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void snakesBoard(int size, int dice, int currp, String ans, ArrayList<String>list){
        if(currp==size){
            list.add(ans);
            return;
        }
        if(currp > size){
            return;
        }
        for(int i=1;i<=dice;i++){
            snakesBoard(size, dice, currp+i, ans+i, list);
        }
        
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int dice=scn.nextInt();
         if(dice > n){
             dice=n;
         }
         ArrayList<String>list=new ArrayList<>();
        snakesBoard(n, dice, 0, "", list);
        System.out.println(list.size());
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
}

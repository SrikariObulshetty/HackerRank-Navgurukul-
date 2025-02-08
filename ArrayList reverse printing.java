import java.io.*;
import java.util.*;

public class Solution {
    public static void printReverse(ArrayList<Integer> al, int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<n;i++) al.add(scn.nextInt());
        printReverse(al, n);
    }
}

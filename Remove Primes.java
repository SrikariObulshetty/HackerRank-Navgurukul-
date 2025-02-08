import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if( (n%i)==0) return false;
        }
        return true;
    }
    public static void removePrimes( ArrayList<Integer> al, int n){
        for(int i=n-1;i>=0;i--){
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }
        System.out.println(al);   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++) al.add(scn.nextInt());
        removePrimes(al, n);
    }
}

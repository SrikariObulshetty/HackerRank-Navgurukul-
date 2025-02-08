import java.io.*;
import java.util.*;

public class Solution {
    public static void firstVowel(char arr[], int n){
        HashSet<Character> set = new HashSet<>();
        Collections.addAll(set, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' );
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        firstVowel(arr, n);
    }
}

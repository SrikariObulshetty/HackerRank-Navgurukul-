import java.io.*;
import java.util.*;

public class Solution {
    public static void kFrequentChars(String s, int k){
        int freq[] = new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c!=' '){
                if(c>='a' && c<='z'){
                    freq[c-'a']++;
                }
                else if(c>='A' && c<='Z'){
                    freq[c-'A']++;
                }
            }
        }
        // a[0] = freq, a[1] is ASCII 
        PriorityQueue<int[]> pq= new PriorityQueue<>( (a,b) -> { if (a[0]==b[0])  return a[1]-b[1] ;
                                                                 return b[0]-a[0];} );
        
        for(int i=0;i<25;i++){
            if(freq[i] >0){
                pq.offer( new int[]{freq[i] , i});
            }
        }
        while(k>0){
            int arr[]=pq.poll();
            System.out.print((char)(arr[1]+'a') + " ");
            k--;
        }  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  scn=new Scanner(System.in);
        String s=scn.nextLine();
        int k=scn.nextInt();
        kFrequentChars(s, k);
        
    }
}

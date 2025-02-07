import java.io.*;
import java.util.*;

public class Solution {
    public static void printAnagrams(HashMap<String, ArrayList<String>>map){
        ArrayList<String>ans=new ArrayList<>();
        for(String key:map.keySet()){
            for(String k:map.get(key)){
                ans.add(k);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
    public static void grpAnagrams(String strs[], int n){
        HashMap<String, ArrayList<String>>map = new HashMap<>();
        for(int i=0;i<n;i++){
            String s=strs[i];
            if(s.length()==0){
                continue;
            }
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String k = String.valueOf(arr); // new String() can behave unexpectedly sometimes, so use String.valueOf(arr)
            if( map.containsKey(k) ){
                map.get(k).add(s);
            }else{
                ArrayList<String>ar=new ArrayList<>();
                ar.add(s);
                map.put(k, ar);
            }
        }
        printAnagrams(map);   
    }
         
        

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String strs[]=new String[n];
        for(int i=0;i<n;i++){
            strs[i]=scn.next();
        }
        grpAnagrams(strs, n);
    }
}

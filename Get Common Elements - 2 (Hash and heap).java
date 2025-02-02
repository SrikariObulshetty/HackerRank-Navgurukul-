import java.io.*;
import java.util.*;

public class Solution {
    public static void getCommonEle(int a1[],int a2[]){
          HashMap<Integer,Integer>map=new HashMap<>();
          for(int e:a1){
              map.put(e, map.getOrDefault(e,0)+1);
          }
          for(int e:a2){
              if(map.containsKey(e)){
                  System.out.println(e);
                  map.put(e, map.get(e)-1);
                  if(map.get(e)==0) map.remove(e);
              }
          }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=scn.nextInt();
        }
        getCommonEle(a1,a2);
        
    }
}

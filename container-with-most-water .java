import java.io.*;
import java.util.*;

public class Solution {
    public static void containerWithMostWater(int height[], int n){
        int l_ptr=0, r_ptr=n-1;
        int ans=0;
        while(l_ptr < r_ptr){
            int wt=r_ptr-l_ptr;
            int ht=0;
            if(height[l_ptr] < height[r_ptr]){
                ht=height[l_ptr];
                l_ptr++;
            }
            else{
                ht=height[r_ptr];
                r_ptr--;
            }
            ans=Math.max(ans, wt*ht);
            
        }
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=scn.nextInt();
        }
        containerWithMostWater(height, n);    
    }
}

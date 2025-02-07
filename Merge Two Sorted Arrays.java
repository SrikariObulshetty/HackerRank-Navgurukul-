import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(int []ans, int n){
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
    public static void mergeSortedArrays(int a1[], int n1, int a2[], int n2){
       int i=0, j=0;
        int ans[] = new int[n1 + n2];
        int k=0;
        while(i<n1 || j<n2){
            if(i<n1 && j<n2){
                // compare.
                if(a1[i] < a2[j]){
                    ans[k++]=a1[i];
                    i++;
                }
                else{
                    ans[k++]=a2[j];
                    j++;
                }
            }
            else if(i<n1){
                ans[k++]=a1[i];
                i++;
            }
            else{
                ans[k++]=a2[j];
                j++;
            }
        }
        printArray(ans, n1 + n2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
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
        mergeSortedArrays(a1, n1, a2, n2);   
    }
}

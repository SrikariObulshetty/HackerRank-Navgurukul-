import java.util.*;

public class Solution {
    public static void countOddPair(int arr[], int n){
        int i = 0, j = n - 1;

        // Rearrange array: move odd numbers to the front and even to the back
        while (i < j) {
            while (i < n && arr[i] % 2 != 0) i++; // Find first even from the left
            while (j >= 0 && arr[j] % 2 == 0) j--; // Find first odd from the right
            if (i < j) {
                // Swap arr[i] and arr[j] to move odd left and even right
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // i now represents the first even index (or n if all are odd)
        int oddEnd = i; 

        // Generate valid odd-even pairs
        for (int k = 0; k < oddEnd; k++) {
            for (int p = oddEnd; p < n; p++) {
                System.out.println(arr[k] + " " + arr[p]);
            }
        }

        // Generate valid even-odd pairs
        for (int p = oddEnd; p < n; p++) {
            for (int k = 0; k < oddEnd; k++) {
                System.out.println(arr[p] + " " + arr[k]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        countOddPair(arr, n);
    }
}

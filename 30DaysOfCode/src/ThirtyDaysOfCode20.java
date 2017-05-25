/**
 * Created by kiyomizumia on 2017/05/24.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode20 {

    public static class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int[] a = new int[n];
            int swaps = 0;

            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            // Write Your Code Here
            for (int i = 0; i < n; i++) {
                int numberOfSwaps = 0;
                for (int j = 0; j < n - 1; j++) {
                    // Swap adjacent elements if they are in decreasing order
                    if (a[j] > a[j + 1]) {
                        a[j] = swap(a[j+1], a[j+1] = a[j]);
                        numberOfSwaps++;
                    }
                }

                // If no elements were swapped during a traversal, array is sorted
                if (numberOfSwaps == 0) {
                    break;
                } else {
                    swaps += numberOfSwaps;
                }
            }

            System.out.println("Array is sorted in " + swaps + " swaps.");
            System.out.println("First Element: " + a[0]);
            System.out.println("Last Element: " + a[a.length-1]);
        }

        public static int swap(int a, int b) {
            return a;
        }
    }
}

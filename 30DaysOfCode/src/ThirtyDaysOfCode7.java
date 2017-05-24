/**
 * Created by kiyomizumia on 2017/05/22.
 */

import java.io.*;
import java.util.*;


public class ThirtyDaysOfCode7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
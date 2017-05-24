/**
 * Created by kiyomizumia on 2017/05/23.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = -100;
        int cur = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                cur = ibarSum(arr, i, j);
                if (cur > max)
                    max = cur;
            }
        }
        System.out.print(max);
    }

    public static int ibarSum(int[][] arr, int i, int j) {
        return arr[i][j - 1] +
                arr[i][j] +
                arr[i][j + 1] +
                arr[i + 1][j] +
                arr[i + 2][j - 1] +
                arr[i + 2][j] +
                arr[i + 2][j + 1];
    }
}
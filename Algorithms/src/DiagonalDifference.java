/**
 * Created by kiyomizumia on 2017/06/01.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int rsum = 0;
        for(int i = 0; i < a.length; i++)
            rsum = a[i][i] + rsum;

        int lsum = 0;
        int c = 0;
        for(int j = a.length-1; j >= 0; j--) {
            lsum = a[c][j] + lsum;
            c++;
        }

        System.out.println(Math.abs(rsum-lsum));
    }
}

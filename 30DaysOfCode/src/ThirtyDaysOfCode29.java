/**
 * Created by kiyomizumia on 2017/05/31.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int max = 0;

            //O(n^2) solution
            for(int i = 1; i <= n; i++) {
                for(int j = 0; j < k; j++) {
                    if(i != j) {
                        if(max < (i&j)) {
                            max = i&j;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    public static String convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;

        String binString = "";

        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            binString += binary[i];
        }
        return binString;
    }
}

class BinaryString {
    BinaryString(String string) {
        for (byte b : string.getBytes()) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    BinaryString(Integer integer) {
        System.out.println(Integer.toBinaryString(integer));
    }
}
/**
 * Created by kiyomizumia on 2017/05/23.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode9 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt(), 1));

    }


    public static int factorial(int num, int total) {
        if (num == 1) {
            return 1;
        } else {
            total = num * factorial(num - 1, total);
        }
        return total;
    }

}

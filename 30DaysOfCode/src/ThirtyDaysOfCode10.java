/**
 * Created by kiyomizumia on 2017/05/23.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ThirtyDaysOfCode10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();

        int n = in.nextInt();
        while (n > 0) {
            stk.push(n % 2);
            n = n / 2;
        }

        int prev = 0;
        int o = 1;
        int max = 1;
        String s = "";
        while (!stk.empty()) {
            int cur = stk.pop();
            if (cur == 1 && prev == 1) {
                o = o + 1;
            }
            if (cur == 0) {
                if (o > max)
                    max = o;
                o = 1;
            }
            prev = cur;
        }
        if (o > max)
            max = o;
        System.out.print(max);
    }
}

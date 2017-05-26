/**
 * Created by kiyomizumia on 2017/05/26.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode25 {
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int val = 0;

        while (sc.hasNext()) {
            val = sc.nextInt();

            if (val == 1 || val == 0) {
                System.out.println("Not prime");
            } else {
                boolean notPrime = false;

                for (int i = 2; i <= Math.sqrt(val); i++) {
                    if (val % i == 0) {
                        notPrime = true;
                        break;
                    }
                }

                if (notPrime == false)
                    System.out.println("Prime");
                else {
                    System.out.println("Not prime");
                }
            }
        }
        sc.close();
    }
}

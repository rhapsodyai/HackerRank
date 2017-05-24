/**
 * Created by kiyomizumia on 2017/05/22.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysofCodeDay6alt {
    static String input = "";
    static String sleft = "";
    static String sright = "";
    static String solution = "";

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while(sc.hasNext()) {
            divideString(sc.nextLine());
        }
        sc.close();
    }

    public static void divideString(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                solution += input.charAt(i);
            }
        }

        solution += " ";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 1) {
                solution += input.charAt(i);
            }
        }

        System.out.println(solution);
        solution = "";
    }


}

/**
 * Created by kiyomizumia on 2017/05/20.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode5 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.valueOf(n) + " x " + i + " = " + String.valueOf(n * i));
        }
    }
}

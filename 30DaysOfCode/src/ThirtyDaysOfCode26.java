/**
 * Created by kiyomizumia on 2017/05/26.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;

public class ThirtyDaysOfCode26 {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);

            String actualDate = sc.nextLine();
            String expectedDate = sc.nextLine();
            String[] actualTokens = actualDate.split(" ");
            String[] expectedTokens = expectedDate.split(" ");

            //still in the same calendar month and year
            if(actualTokens[1].equals(expectedTokens[1]) && actualTokens[2].equals(expectedTokens[2])) {
                if(getInt(actualTokens[0]) > getInt(expectedTokens[0])) {
                    System.out.println(15 * (Integer.parseInt(actualTokens[0]) - Integer.parseInt(expectedTokens[0])));
                } else {
                    System.out.println("0");
                }
                //in a different calendar month but the same calendar year
            } else if(getInt(actualTokens[1]) > getInt(expectedTokens[1]) && actualTokens[2].equals(expectedTokens[2])) {
                System.out.println(500 * (getInt(actualTokens[1]) - getInt(expectedTokens[1])));
                //in a different calendar year
            } else if(getInt(actualTokens[2]) > getInt(expectedTokens[2])) {
                System.out.println("10000");
            } else {
                System.out.println("0");
            }
        }

        public static int getInt(String s) {
            return Integer.parseInt(s);
        }
}

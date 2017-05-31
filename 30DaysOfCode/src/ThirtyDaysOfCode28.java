/**
 * Created by kiyomizumia on 2017/05/31.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyDaysOfCode28 {

    // This will match a sequence of 1or more uppercase and lowercase English letters as well as spaces
    static String myRegExString = ".+@gmail\\.com$";

    // This is the string we will check to see if our regex matches:
    static String myString = "";

    // Create a Pattern object (compiled RegEx) and save it as 'p'
    static Pattern p = Pattern.compile(myRegExString);

    static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();

            Matcher m = p.matcher(emailID);

            if (m.find()) {
                names.add(firstName);
                //System.out.println(firstName);
            }

        }

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        for (String n : names) {
            System.out.println(n);
        }
    }
}

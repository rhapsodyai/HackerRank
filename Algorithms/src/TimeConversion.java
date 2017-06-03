/**
 * Created by kiyomizumia on 2017/06/02.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String ampm = new String();
        String hour = new String();

        ampm += time.charAt(time.length()-2) ;
        ampm += time.charAt(time.length()-1);
        hour += time.charAt(0);
        hour +=time.charAt(1);
        int num = Integer.valueOf(hour);

        if(ampm.equals("PM")) {
            if(num == 12) {}
            else
                num += 12;
        }
        if(ampm.equals("AM")) {
            if(num == 12) {
                num -= 12;
            }
        }

        hour = String.valueOf(num);

        StringBuilder sb = new StringBuilder(time.substring(2,time.length()-2));
        if(hour.length() == 1) {
            sb.insert(0, hour.charAt(0));
            sb.insert(0, "0");
        } else {
            sb.insert(0, hour.charAt(1));
            sb.insert(0, hour.charAt(0));
        }

        System.out.println(sb);
    }
}

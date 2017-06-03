/**
 * Created by kiyomizumia on 2017/06/02.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        int max = 0;
        for(int x : height) {
            if(x > max)
                max = x;
        }

        int count = 0;
        for(int x : height) {
            if(x == max)
                count++;
        }

        System.out.println(count);
    }
}


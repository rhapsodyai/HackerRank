/**
 * Created by kiyomizumia on 2017/06/02.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long min = 2147483647;
        min *= 2147483647;
        long max = 0;
        for(int i = 0; i < arr.length; i++) {
            long sum = 0;
            for(int j = 0; j < arr.length; j++){
                if(i != j) {
                    sum += arr[j];
                }
            }
            // System.out.println(sum);
            if(sum < min)
                min = sum;
            if(sum > max)
                max = sum;
        }
        System.out.print(min + " " + max);
    }
}

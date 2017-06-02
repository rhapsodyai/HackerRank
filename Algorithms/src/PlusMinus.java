/**
 * Created by kiyomizumia on 2017/06/02.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        float[] rep = new float[3];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0.0) {
                rep[0]++;
            } else if(arr[i] == 0.0) {
                rep[1]++;
            } else {
                rep[2]++;
            }
        }

        System.out.println(rep[0]/arr.length);
        System.out.println(rep[2]/arr.length);
        System.out.println(rep[1]/arr.length);
    }
}


/**
 * Created by kiyomizumia on 2017/06/02.
 */
import java.io.*;
import java.util.*;
//import org.apache.commons.lang3.ArrayUtils;


public class Abbreviation {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();


        while(sc.hasNext()) {
            String input = new String(sc.nextLine());
            String check = new String(sc.nextLine());
            int count = 0;
            for(int i = 0; i < check.length(); i++) {
                for(int j = 0; j < input.length(); j++) {
                    if(Character.isUpperCase(input.charAt(j))) {
                        if(check.charAt(i) == input.charAt(j) || check.charAt(i) == Character.toLowerCase(input.charAt(j))) {
                            //System.out.println("X");
                            StringBuilder sb = new StringBuilder(input);
                            sb.deleteCharAt(j);
                            input = sb.toString();
                            count++;
                        }
                    } else {
                        if(check.charAt(i) == input.charAt(j) || check.charAt(i) == Character.toUpperCase(input.charAt(j))) {
                            //System.out.println("Y");
                            StringBuilder sb = new StringBuilder(input);
                            sb.deleteCharAt(j);
                            input = sb.toString();
                            count++;
                        }
                    }
                }
            }

            if(count == check.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static int[] removeElement(int[] original, int element){
        int[] n = new int[original.length - 1];
        System.arraycopy(original, 0, n, 0, element );
        System.arraycopy(original, element+1, n, element, original.length - element-1);
        return n;
    }
}
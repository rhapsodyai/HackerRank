//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class ThirtyDaysOfCode8 {
    public static void main(String []argh){
        HashMap<String,String> m = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if(m.containsKey(s)) {
                System.out.println(s + "=" + m.get(s));
            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}

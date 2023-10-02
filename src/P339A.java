import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class P339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] s1 = s.split("\\+", 3);
        for(int i = 0; i < s1.length-1; i++) {
            int a = Integer.valueOf(s1[i]);
            int b = Integer.valueOf(s1[i+1]);
            if( a >= b) {
               int temp = a;

            }
        }
       String out = String.join("+", s1);
        System.out.println(out);
    }
}

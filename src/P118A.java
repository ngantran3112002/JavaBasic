import java.util.Scanner;

public class P118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();


        String s2 = "";
        for(int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == 'u' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
            || s.charAt(i) == 'y') {
               continue;
            }
             s2 += s.charAt(i);
        }
        String s1 = "";
        for(int i = 0; i < s2.length(); i++) {
            s1 += ".";
            s1 += s2.charAt(i);
        }
        System.out.println(s1);
    }
}

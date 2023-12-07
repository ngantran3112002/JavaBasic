import java.sql.SQLOutput;
import java.util.Scanner;

public class P58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = "hello";
        int j = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(j < k.length()) {
                if(s.charAt(i) == k.charAt(j)) {
                    j++;
                    count ++;
                }
            }
        }
        if(count == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

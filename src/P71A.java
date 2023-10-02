import java.util.Scanner;

public class P71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase > 0) {
            String text = sc.next();
            if(text.length() <= 10) {
                System.out.println(text);
            } else{
                int n = text.length();
                System.out.println(text.charAt(0) + String.valueOf(n-2) + text.charAt(n-1) );
            }
            testcase--;
        }

    }
}


import java.util.Scanner;

public class Problem1850B {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase != 0) {
            int n = sc.nextInt();
            int temp = 0;
            int maxNumber = -1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a <= 10) {
                    if (b >= maxNumber) {
                        maxNumber = b;
                        temp = i;
                    }
                }
            }
            System.out.println(temp + 1);
            testcase--;
        }
    }
}

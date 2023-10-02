import static java.lang.Math.abs;

import java.util.*;

public class Problem1853A {
    static int Solve(List<Integer> l, int length) {
        int minDistance = (int) 10e9;
        int a = 0, b = 0;
        for (int i = 0; i < length - 1; i++) {
            if (l.get(i) > l.get(i + 1)) {
                return 0;
            }
        }
        for (int i = 0; i < length - 1; i++) {
            if (abs((int) l.get(i) - (int) l.get(i + 1)) < minDistance) {
                minDistance = abs((int) l.get(i) - (int) l.get(i + 1));
                a = (int) l.get(i);

                b = (int) l.get(i + 1);
            }
        }
        int x = 0;

        x = abs((((int) (a + b) / 2) + 1) - a);
        return x;

    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while (testcase > 0) {
            int length = sc.nextInt();
            List<Integer> l = new ArrayList<Integer>();

            for (int i = 0; i < length; i++) {
                int a = sc.nextInt();
                l.add(a);
            }
            System.out.println(Solve(l, length));

            testcase--;
        }
    }
}





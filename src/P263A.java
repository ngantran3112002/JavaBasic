import java.util.Scanner;

import static java.lang.Math.abs;

public class P263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int k = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == 1) {
                    k = abs(2 - i);
                    b = abs(2 - j);
                }
            }
        }
        System.out.println(k+b);
    }
}

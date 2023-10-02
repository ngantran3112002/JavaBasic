import java.util.Scanner;

public class P231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[][] = new int[1000][1000];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int cnt2 = 0;
        for (int i = 0; i < length; i++) {
            int cnt1 = 0;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 1) {
                    cnt1++;
                }
            }
            if (cnt1 >= 2) {
                cnt2++;
            }
        }
        System.out.println(cnt2);
    }
}

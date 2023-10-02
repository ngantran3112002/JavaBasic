import java.util.Scanner;

public class P1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        if(n == m) {
            if((m%a) == 0) {
                long k1 =(long) (m/a)*(m/a);
                System.out.println(k1);
            } else {
                int k = (m / a) + 1;
                long k2 = (long) k*k;
                System.out.println(k2);
            }
        } else {
            if(n % a == 0 && m % a == 0) {
                long k3 = (long) (n/a)*(m/a);
                System.out.println(k3);
            } else if(n%a == 0 && m%a != 0) {
                int a3 = (m/a)+1;
                long k4 = (long) a3*(n/a);
                System.out.println(k4);
            } else if(m%a == 0 && n %a != 0) {
                int a4 = (n/a)+1;
                long k5 = (long)a4*(m/a);
                System.out.println(k5);
            } else {
                int a1 = (n/a) +1;
                int a2 = (m/a) +1;
                long k6 = (long) a1*a2;
                System.out.println(k6);
            }
        }
    }

}

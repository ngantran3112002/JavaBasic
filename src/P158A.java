import java.util.Scanner;

public class P158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[10];
        for(int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        if(a[k-1] > 0) {
            if(a[k-1] == a[k]) {
                System.out.println(k+1);
            }
        } else {
            System.out.println(0);
        }
    }
}

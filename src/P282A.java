import java.util.Scanner;

public class P282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int init = 0;
        while(x > 0) {
            String s = sc.next();
            if(s.contains("+")) {
                init++;
            } else {
                init--;
            }
            x--;
        }
        System.out.println(init);
    }
}

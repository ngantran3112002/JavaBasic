import java.util.Scanner;

public class P617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int cnt = 0;
        while(input > 0){
            if(input >= 5) {
                input -= 5;
                cnt++;
            } else if(input >= 4) {
                input -= 4;
                cnt++;
            } else if(input >= 3) {
                input -= 3;
                cnt++;
            } else if(input >= 2) {
                input -= 2;
                cnt++;
            } else if(input >= 1) {
                input -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

import java.util.Scanner;

import static java.util.Arrays.compare;

public class P96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        boolean flag ;
        int i = 0;
        while(i <= s.length()-3) {
            if(Character.compare(s.charAt(i), s.charAt(i+1)) == 0) {
                int cnt = 2;
                int j = i + 1;
                flag = true;
                while(flag && j <= s.length()-2) {
                    if(s.charAt(j) == s.charAt(j+1)) {
                        flag = true;
                        cnt++;
                        System.out.println(cnt);
                        j++;
                    } else {
                        flag = false;
                    }
                }
                if(cnt >= 7) {
                    System.out.println("YES");
                    return;
                }
                i = j + 1;
            } else {
                i++;
            }
        }
        System.out.println("NO");
    }
}

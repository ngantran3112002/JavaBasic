
import java.util.*;
public class Problem1862A {

        public static void main(String[] agrs) {
            Scanner sc = new Scanner(System.in);
            int testcase = sc.nextInt();
            while (testcase > 0) {
                int row, column;
                row = sc.nextInt();
                column = sc.nextInt();
                String[] a = new String[100];

                for (int i = 0; i < row; i++) {
                    a[i] = sc.next();
                }


                int cnt = 0;
                String s = "";
                for (int i = 0; i < column; i++) {
                    int j = 0;
                    while (j < row) {
                        if (a[j].charAt(i) == 'v' && !s.contains("v")) {

                            s += "v";
                            cnt++;
                            break;
                        }
                        if (a[j].charAt(i) == 'i' && s.contains("v") && !s.contains("i")) {

                            s += "i";
                            cnt++;
                            break;
                        }
                        if (a[j].charAt(i) == 'k' && s.contains("vi") && !s.contains("k") ) {

                            s += "k";
                            cnt++;
                            break;
                        }
                        if (a[j].charAt(i) == 'a' && s.contains("vik")) {

                            s += "a";
                            cnt++;
                            break;
                        }
                        j++;
                    }
                }
                if (s.contains("v") && s.contains("i") && s.contains("k") && s.contains("a") ) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                testcase--;
            }
        }
    }



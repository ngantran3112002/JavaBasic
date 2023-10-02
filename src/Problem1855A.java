import java.util.Scanner;

public class Problem1855A {




        public static void main(String[] agrs) {
            Scanner sc = new Scanner(System.in);
            int testcase = sc.nextInt();
            while (testcase > 0) {
                int[] a = new int[10000];
                int length = sc.nextInt();
                for(int i = 0; i < length; i++) {
                    a[i] = sc.nextInt();
                }
                int count = 0;
                for(int i = 0; i < length; i++) {
                    if(i+1 == a[i]) {
                        count ++;
                    }
                }
                if( count % 2 == 0) {
                    System.out.println(count / 2);
                } else if(count%2 != 0) {
                    System.out.println((count/2)+1);
                } else if(count == 1) {
                    System.out.println(count);
                }
                testcase--;
            }
        }
    }


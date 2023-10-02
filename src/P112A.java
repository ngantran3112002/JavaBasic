    import java.util.Scanner;

    public class P112A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            String a1 = s1.toLowerCase();
            String s2 = sc.next();
            String a2 = s2.toLowerCase();
            boolean flag = true;
            for(int i = 0; i < a1.length(); i++){
                int temp1 = (int)a1.charAt(i);
                int temp2 = (int)a2.charAt(i);
                if(temp1 < temp2) {
                    System.out.println(-1);
                    flag = false;
                    break;
                } else if(temp1 == temp2) {
                    flag = true;
                } else {
                    System.out.println(1);
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.println(0);
            }
        }
    }

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxtime = 0;
        int unhappyday = 0;

        for ( int day=1; day<=7; day++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int total = a + b;
            if (total > 8) {

                if (total - 8 > maxtime) {
                    maxtime = total - 8;
                    unhappyday = day;
                }
            }
        }
            System.out.println(unhappyday);
            scanner.close();




    }
}

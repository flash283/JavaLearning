import java.util.Scanner;

public class P1217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        for (int i = a; i <= b; i++) {
            if (hui(i) && zhi(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean hui(int n) {
        int t = n;
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse == t;
    }

    static boolean zhi(int m) {
        if (m < 2) return false;
        boolean ist = true;
        for (int k = 2; k * k <= m; k++) {
            if (m % k == 0) {
                ist = false;
                break;
            }
        }
        if (ist) {
            return true;
        } else {
            return false;
        }
    }
}




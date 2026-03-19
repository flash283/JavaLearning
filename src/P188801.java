import java.util.Scanner;

public class P188801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gcd = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        min /= gcd;
        max /= gcd;

        System.out.println(min + "/" + max);
        scanner.close();
    }
}

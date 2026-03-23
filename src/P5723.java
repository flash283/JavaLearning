import java.util.Scanner;

public class P5723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int count = 0;

        for (int i = 2; i <= L; i++) {
            boolean isPrime = true;
            // 判断 i 是否是质数
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (sum + i <= L) {
                    System.out.println(i);
                    sum += i;
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
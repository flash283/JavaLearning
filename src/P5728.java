import java.util.Scanner;

public class P5728 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] sum = new int[n];

        // 第一步：读取所有数据
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
            sum[i] = a[i] + b[i] + c[i];
        }

        // 第二步：比较所有学生对
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) <= 5 &&
                        Math.abs(b[i] - b[j]) <= 5 &&
                        Math.abs(c[i] - c[j]) <= 5 &&
                        Math.abs(sum[i] - sum[j]) <= 10) {
                    count++;
                }
            }
        }

        System.out.println(count);
        scan.close();
    }
}
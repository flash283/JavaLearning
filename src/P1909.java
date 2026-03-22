import java.util.Scanner;

public class P1909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 0;

        for (int i = 1; i <= 3; i++) {
            int num = scanner.nextInt();
            int price = scanner.nextInt();
            int total = ((n + num - 1) / num) * price;
            if (i == 1) {
                min = total;
            } else if (total < min) {
                min = total;
            }
            /*--------一开始的复杂写法-------------
            if (i == 1) {
                min = total;
            }
            if (i > 1) {
                int tempt = total - m;
                if (tempt > 0) {
                    m = total;
                } else {
                    min = total < min ? total : min;
                }
            }
        }*/
        }
            System.out.println(min);
            scanner.close();
        }
    }

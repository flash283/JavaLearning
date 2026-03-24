import java.util.Scanner;

public class P5721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int count=1;
        for (int i = n; i >=1; i--) {
           for(int j=1;j<=i;j++){
                System.out.printf("%02d",count);
                count++;
           }
           System.out.println();
        }
    }
}

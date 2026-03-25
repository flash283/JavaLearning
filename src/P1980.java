import java.util.Scanner;

public class P1980 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++)   {
            int t=i;
            while(t>0){
                if(t%10==x){
                    count++;
                }
                t=t/10;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class P5705 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        int n=(int)(a*10);
        int b= n%10;
        int c= (n/10)%10;
        int d=(n/100)%10;
        int e=n/1000;
        System.out.println(b+"."+c+""+d+""+e);
    }
}

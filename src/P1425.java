import java.util.Scanner;

public class P1425 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int start=a*60+b;
        int end=c*60+d;
        int tempt=end-start;
        int e=tempt/60;
        int f=tempt%60;
        System.out.println(e+" "+f);
        scanner.close();
    }
}

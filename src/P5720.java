import java.util.Scanner;

public class P5720 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();

        int day=1;
        while(a>1){
            a=a/2;
            day++;

        }
        System.out.println(day);
    }

}

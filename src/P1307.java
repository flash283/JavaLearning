import java.util.Scanner;

public class P1307 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int result=0;
        int sign=N<0?-1:1;
        N=Math.abs(N);
        while(N>0){
            result=result*10+N%10;
            N=N/10;
        }
        System.out.println(sign*result);
    }
}

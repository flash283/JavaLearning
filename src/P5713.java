import java.util.Scanner;

public class P5713 {
    public static  void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=3*n+11;
        int b=5*n;
        if(a>b){
            System.out.println("Local");
        }else{
            System.out.println("Luogu");
        }
        scanner.close();


    }

}

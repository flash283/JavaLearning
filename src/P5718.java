import java.util.Scanner;

public class P5718 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int min=0;
        for(int i=1;i<=n;i++){
            int num=scanner.nextInt();
            if(i==1){
                min=num;
            }else if(num<=min){
                min=num;
            }

        }
        System.out.println(min);
    }
}


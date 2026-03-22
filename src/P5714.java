import java.util.Scanner;

public class P5714 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double m=scanner.nextDouble();
        double h=scanner.nextDouble();
        double BMI=m/(h*h);
        int c;
        if(BMI<18.5){
             c=0;
        }else if(BMI<24){
            c=1;
        }else{
            c=2;
        }
        switch(c){
            case 0:
                System.out.println("Underweight");
                break;
            case 1:
                System.out.println("Normal");
                break;
            case 2:
                System.out.printf("%.6f\n",BMI);
                System.out.println("Overweight");
                break;
        }
        scanner.close();
    }

}

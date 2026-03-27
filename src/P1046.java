import java.util.Scanner;

public class P1046 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] high=new int[10];
        for(int i=0;i<high.length;i++){
            high[i]=scan.nextInt();
        }
        int able= scan.nextInt();
        int count=0;
        for(int j=0;j<high.length;j++){
            if(high[j]<=(able+30)){
                count++;
            }
        }
     System.out.println(count);
    }
}

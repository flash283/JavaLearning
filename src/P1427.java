import java.util.Scanner;

public class P1427 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] num=new int[100];
        int count=0;
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
            if(num[i]==0){
                count=i;
                break;
            }
        }
        scan.close();
        for(int j=count-1;j>=0;j--){
         System.out.print(num[j]+" ");
            }
        }

    }


import java.util.Scanner;

public class P5727 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
      int [] b=new int[1000];
      b[0]=n;
      int i=0;
      int t=n;
      while(t>1){
          if(b[i]%2!=0){
          t=t*3+1;
          b[++i]=t;
          }else{
              t=t/2;
              b[++i]=t;
          }
      }
      for(int j=i;j>=0;j--){
          System.out.print(b[j]+" ");
      }
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class P1177 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
      /*  for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr.length-j-1;k++){
                if(arr[k]>arr[k+1]){
                    int t=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=t;
                }
            }
        }*/
        Arrays.sort(arr);
        scan.close();
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
    }
}

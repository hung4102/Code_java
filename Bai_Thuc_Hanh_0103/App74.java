import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class App74 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        int n;
        out.println("Nhập số lượng phần tử của mảng: ");
        n=sc.nextInt();

        int []a=new int[n];
        for(int i=0;i<n;i++){
            out.println("n[" +i+ "]= ");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                sum=sum+a[i];
            }
      }out.println("Tổng các phần tử chẵn là: "+sum);
    }
}

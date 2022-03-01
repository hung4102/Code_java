import java.util.Scanner;
import static java.lang.System.*;

public class App2 {
    public static void main(String[] args) {
        var sc=new Scanner(in);

        out.println("Nhập cạnh thứ nhất: ");
        int a= sc.nextInt();
        out.println("Nhập số thứ hai: ");
        int b = sc.nextInt();
        out.println("Nhập cạnh thứ ba: ");
        int c = sc.nextInt();

        if( a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                out.println("Day la tam giac vuong");
            else if(a==b && b==c)

                out.println("Day la tam giac deu");
            else if(a==b || a==c || b==c){
                if ( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                    out.println("Day la tam giac vuông cân");
                else
                out.println("Day la tam giac can");
            }
            else
                out.println("Day la tam giac thường");
        }
        else
            out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");

    }}

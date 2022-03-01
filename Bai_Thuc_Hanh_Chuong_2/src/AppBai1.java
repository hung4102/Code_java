import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

    public class AppBai1 {
        public static void main(String[] args) {
            var sc=new Scanner(in);
            out.println("Nhập số thứ nhất: ");
            float a=sc.nextFloat();
            out.println("Nhập số thứ hai: ");
            float b=sc.nextFloat();

            float sum=a+b;
            float difference=a-b;
            float product=a*b;
            float quotient=a/b;
            float remainder=a%b;
            out.println(+a+"+"+b+"= "+sum);
            out.println(+a+"-"+b+"= "+difference);
            out.println(+a+"*"+b+"= "+product);
            out.println(+a+"/"+b+"= "+quotient);
            out.println(+a+"%"+b+"= "+remainder);
            if (a>b)
                out.println("a>b");
            else if(a==b)
                out.println("a=b");
            else out.println("a<b");

        }
    }



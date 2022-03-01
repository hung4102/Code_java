import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppBai2 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        out.println("Nhập number: ");
        float number=sc.nextFloat();
        if (number%2==0)
            out.println("Là số chẵn");

        else out.println("Là số lẻ");
    }
}

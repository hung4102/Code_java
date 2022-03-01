import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppBai5 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        int sum = 0, number;
        do{
            out.println("Nhập vào số nguyên bất kỳ: ");
             number= sc.nextInt();
            sum += number;

        } while(sum<100);
        out.println("Tổng các số nguyên vừa nhập là "+sum);

    }
}

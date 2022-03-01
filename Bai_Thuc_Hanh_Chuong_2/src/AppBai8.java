import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppBai8 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        int number, sum=0;
        float avgNumber;
        out.println("Nhập vào n các số nguyên có trong dãy: ");
        int n=sc.nextInt();
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = sc.nextInt();
            sum += number;
        }

        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + avgNumber);
    }
    }


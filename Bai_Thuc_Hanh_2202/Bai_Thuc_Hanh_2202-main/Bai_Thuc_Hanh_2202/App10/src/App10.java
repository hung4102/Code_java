import java.util.Scanner;
import static java.lang.System.*;

public class App10 {
    public static void main(String[] args) {
        var sc = new Scanner(in);

        long temp;
        int count = 0;
        int n;
        do {
            out.println("Nhập vào số nguyên n lớn hơn 0: ");
            n = sc.nextInt();
            if (n <= 0) {
                out.println(" Số n phải lớn hơn 0, vui lòng nhập lại !");
            }
        } while (n <= 0);
        temp = n;
        if (n == 0) count = 1;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        out.println("Số chữ số là "+count);
    }
}

import java.util.Scanner;
import static java.lang.System.*;

public class App9 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        int n= sc.nextInt();
        int donvi;
        out.println("Số đảo ngược là: ");
        while (n > 0)
        {
            donvi = n % 10;
            n = n / 10;
            out.print(donvi);
        }
    }
}

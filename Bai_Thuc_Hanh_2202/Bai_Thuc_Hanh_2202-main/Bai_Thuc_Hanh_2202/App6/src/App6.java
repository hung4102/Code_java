import java.util.Scanner;
import static java.lang.System.*;

public class App6 {
    public static void main(String[] args) {
        var sc = new Scanner(in);
        long sum;
        out.println("Enter your number: ");
        int n = sc.nextInt();
        for (int number = 1; number <= n; number++) {
            sum = 0;
            for (int i = 1; i <= number; i++)
                if (number % i == 0)
                    sum += i;
            if (sum / 2.0 == number)
                out.println(number);
        }

    }
}

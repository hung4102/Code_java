import java.util.Scanner;
import static java.lang.System.*;

public class App1 {
    public static void main(String[] args) {
        var sc=new Scanner(in);

        out.println("Nhập số thứ nhất: ");
        int firstnumber= sc.nextInt();
        out.println("Nhập số thứ hai: ");
        int secondnumber= sc.nextInt();
        System.out.println("USCLN của " + firstnumber + " và " + secondnumber
                + " là: " + USCLN(firstnumber, secondnumber));}
        public static int USCLN(int firstnumber, int secondnumber) {
            if (secondnumber == 0) return firstnumber;
            return USCLN(secondnumber, firstnumber % secondnumber);

}}

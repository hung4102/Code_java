package src;

import java.util.Scanner;
import static java.lang.System.*;

public class App47 {
    public static void main(String[] args) {
        int number, sum = 0;
        var scanner=new Scanner(in);
        do{
            out.println("Nhập vào số nguyên bất kỳ: ");
            number= scanner.nextInt();
            sum += number;

        } while(sum<100);
        out.println("Tổng các số nguyên vừa nhập là "+sum);


    }}
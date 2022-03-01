import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppBai4 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        out.println("Nhập số từ 1 đến 12: ");
        int n=sc.nextInt();
        switch(n){
            case 1: out.println("Tháng 1");
            break;
            case 2:out.println("Tháng 2");
                break;
            case 3:
            out.println("Tháng 3");
            break;
            case 4: out.println("Tháng 4");
            break;
            case 5:
                out.println("Tháng 5");
                break;
            case 6:
                out.println("Tháng 6");
                break;
            case 7:
            out.println("Tháng 7");
            break;
            case 8: out.println("Tháng 8");
                break;
            case 9: out.println("Tháng 9");
                break;
            case 10: out.println("Tháng 10");
                break;
            case 11: out.println("Tháng 11");
            break;
            case 12: out.println("Tháng 12");
                break;
            default: out.println("Mời nhập lại số (1-12)!!!");
    }}
}

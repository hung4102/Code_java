package src;
import java.util.Scanner;

import static java.lang.System.*;

public class App40 {
    public static void main(String[] args) {

        var scanner = new Scanner(in);
        out.println("Nhập ngày trong tuần: ");
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                out.println("Chủ nhật");
                break;
            case 1:
                out.println("Thứ hai");
                break;
            case 2:
                out.println("Thứ ba");
                break;
            case 3:
                out.println("Thứ tư");
                break;
            case 4:
                out.println("Thứ năm");
                break;
            case 5:
                out.println("Thứ sáu");
                break;
            case 6:
                out.println("Thứ bảy");
                break;
            default:
            out.println("Số ngày trong tuần sai! ");

        }
    }}



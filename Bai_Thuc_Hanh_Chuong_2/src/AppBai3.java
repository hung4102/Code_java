import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppBai3 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        String chuoi;
        out.println("Nhập tên: ");
        chuoi=sc.nextLine();
        out.println("Nhập năm sinh: ");
        int year= sc.nextInt();
        int age= 2022-year;
        if(age<16)
            out.println("Bạn "+ chuoi+ " ở độ tuổi vị thành niên");
        else if(age>=16&&age<18)
            out.println("Bạn "+ chuoi+ " ở độ tuổi trưởng thành");
        else out.println("Bạn " + chuoi+" đã già");





    }
}

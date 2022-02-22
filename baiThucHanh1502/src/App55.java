package src;

import java.util.Scanner;
import static java.lang.System.*;
public class App55 {
    public static void main(String[] args) {
        var scanner= new Scanner(in);
        for(int i=0;i<=20;i++){
            if(i%5 !=0)
            {
                continue;
            }
            out.println(i);
        }
    }
}

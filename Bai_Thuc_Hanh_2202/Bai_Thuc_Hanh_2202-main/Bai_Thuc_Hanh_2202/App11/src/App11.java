import java.util.Scanner;
import static java.lang.System.*;

public class App11 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<=20;i++)
            for(j=0;j<=10;j++)
                for(k=0;k<=4;k++)
                    if(i*10000+j*20000+k*50000==200000)
                        out.println(+i+" tờ 10000 "+j+" tờ 20000 "+ k+" tờ 50000");



    }
}

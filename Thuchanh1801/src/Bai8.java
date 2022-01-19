import java.util.Scanner;
public class Bai8 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double a,b,c, delta, x1,x2;
		System.out.print("Nhap a = ");
		a = scanner.nextDouble();
		System.out.print("Nhap b = ");
		b = scanner.nextDouble();
		System.out.print("Nhap c = ");
		c = scanner.nextDouble();
		if (a == 0) {
			 if (b == 0) {
	                System.out.println("Phuong trinh vo nghiem");
	            } else {
	                System.out.println("Phuong trinh co mot nghiem: "
	                        + "x = " + (-c / b));
	            }
	            return;
		}
		delta = b*b - 4*a*c;
		if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep la: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
		
		}
}

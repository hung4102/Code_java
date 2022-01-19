
// xây dựng chương trình giải hệ phương trình tuyến tính (2 phương trình), các hso nhập vào từ bphim
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		//CHI AP DUNG CHO HE PHUONG TRINH TUYEN TINH (2 PHUONG TRINH, 2 AN)
		double m[][] = new double[2][3];
		double res[] = new double[2];

		// Nhap vao he so cua ma tran he phuong trinh
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao ma tran phuong trinh: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int indexI = i + 1;
				int indexJ = j + 1;
				System.out.println("m_" + indexI + "_" + indexJ + " = ");
				m[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		
		//Sap xep he phuong trinh theo he so cua x theo thu tu lon den be
		for (int i = 0; i < m.length-1; i++)
            for (int k = i+1; k < m.length; k++)
                if (m[i][i] < m[k][i])
                    for (int j = 0; j <= m.length ; j++)
                    {
                        double t = m[i][j];
                        m[i][j] = m[k][j];
                        m[k][j] = t;
                    }
		
		// In ra he phuong trinh
		System.out.println("He phuong trinh tuyen tinh co dang:");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%.0fx + %.0fy = %.0f\n", m[i][0], m[i][1], m[i][2]);
		}
		
		//Khu Gauss
		for (int i = 0; i < m.length-1; i++)
            for (int k = i+1; k < m.length; k++)
            {
                double t = m[k][i] / m[i][i];
                for (int j = 0; j <= m.length ; j++)
                    m[k][j] = m[k][j] - t * m[i][j];
            }
		
		//Giai he
		for (int i = m.length-1; i >= 0 ; i--)
        {
            res[i] = m[i][m.length];
            for (int j = 0; j <m.length; j++)
                if (i != j)
                    res[i] = res[i] - m[i][j] * res[j];
            res[i] = res[i] / m[i][i];
        }
		
		//In ra nghiem
		System.out.println("Nghiem cua he phuong trinh tuyen tinh la: ");
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
        
        

	}
}

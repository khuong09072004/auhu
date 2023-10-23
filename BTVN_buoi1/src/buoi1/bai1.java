package buoi1;

import java.util.Scanner;

public class bai1 {

	public static int BSCNN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int USCLN(int a, int b) {
        return (a * b) / BSCNN(a, b);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập ba số tự nhiên a, b và c:");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();

        int bscnn_ab = BSCNN(a, b);
        int bscnn_abc = BSCNN(bscnn_ab, c);

        int uscln_ab = USCLN(a, b);
        int uscln_abc = USCLN(uscln_ab, c);

        System.out.println("BSCNN của " + a + ", " + b + " và " + c + " là: " + bscnn_abc);
        System.out.println("USCLN  của " + a + ", " + b + " và " + c + " là: " + uscln_abc);
    }
}

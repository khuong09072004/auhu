package buoi1;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
        Scanner  sn=new Scanner(System.in);
        System.out.println("Nhập 5 số nguyên:");
        int max1 = sn.nextInt(); 
        int max2 = sn.nextInt(); 

        for (int i = 0; i < 3; i++) {
            int so = sn.nextInt();
            if (so > max1) {
                max2 = max1;
                max1 = so;
            } else if (so > max2 && so != max1) {
                max2 = so;
            }else if (so == max1)
            {
                max2 = max1;
            }
        }

        System.out.println("Hai số lớn nhất là: " + max1 + " và " + max2);
    }
}

package buoi1;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhâp số nguyên n:");
		int n =sn.nextInt();
		int tich=1;
		while(n>0) {
			tich*=n%10;
			n/=10;
		}
		
		System.out.print("Tích các số nguyên là :"+ tich);

	}

}

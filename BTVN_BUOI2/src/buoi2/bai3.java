package buoi2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap vao 1 xau ki tu: ");
		String a=sc.nextLine();
		int chucai=0;
		int so =0;
		int kitudb=0;
		for(int i=0;i<a.length();i++) {
			char ktra=a.charAt(i);
			if(Character.isLetter(ktra)) {
				chucai++;
			}
			else if(Character.isDigit(ktra)) {
				so++;
			}
			else {
				kitudb++;
			}
		}
		System.out.println("so luong chu cai la: "+chucai);
		System.out.println("so luong so la: "+so);
		System.out.println("so luong ki tu dac biet la: "+kitudb);

	}

}

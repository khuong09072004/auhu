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
		char[] c = a.toCharArray();
		for(int i = 0;i < a.length();i++) {
			if(((int)c[i] >= 65 && (int)c[i] <= 90) || ((int)c[i] >= 97 && (int)c[i] <= 122))
				chucai++;
			else if((int)c[i] >= 48 && (int)c[i] <= 57)
				so++;
			else if((int)c[i] >= 32)
				kitudb++;
		}
		System.out.println("so luong chu cai la: "+chucai);
		System.out.println("so luong so la: "+so);
		System.out.println("so luong ki tu dac biet la: "+kitudb);
		
	}

}

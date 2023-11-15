package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestB2 {
	static Scanner sc= new Scanner(System.in);
	private static ArrayList<May> list = new ArrayList<>();
	private static PhongMay phongMay = new PhongMay();
	private static int n = 0;

	static {
		list.add(new May(1,"DELL","Good"));
		list.add(new May(2,"ASUS"," Not Good"));
		list.add(new May(3,"PH","Bad"));
		list.add(new May(4,"may tinh anh hai","Good"));
		QuanLy quanly=new QuanLy("01","Khuong");
		phongMay=new PhongMay("001","AHIHI",quanly,list,3);
	}
	public static void timKiemKieuMay() {
		System.out.print("nhap kieu may can tim: ");
		String kieuMay = sc.nextLine();
		for (May may : phongMay.getMays()) {
			if(may.getKieuMay().equals(kieuMay))
				may.output();
			
		}
	}
	public static void timKiemMaMay() {
		System.out.print("nhap ma may can tim:");
		int ma=sc.nextInt();
		for (May may : phongMay.getMays()) {
			if(may.getMaMay()==ma)
				may.output();
				
		}
	}
	public static void menu() {
		System.out.println("<============================>");
		System.out.println("Menu");
		System.out.println("1. nhap thong tin phong may");
		System.out.println("2. in ra thong tin phong may");
		System.out.println("3. tim may theo kieu may");
		System.out.println("4. tim may theo ma may");
		System.out.println("5. thoat");
	}
	
	
	
	public static void main(String[] args) {
		int choose=0;
		do {
			System.out.print("nhap lua chon cua ban:");
			choose=sc.nextInt();
			if(choose==1)
				phongMay.input();
			if(choose==2)
				phongMay.output();
			if(choose==3)
				timKiemKieuMay();
			if(choose==4)
				timKiemMaMay();
			if(choose==5) {
				System.out.println("da thoat!!!!1");
				return;
			}
				
		}while(choose!=6);
		System.out.println("vui long nhap lai!!!!!1");

	}

}

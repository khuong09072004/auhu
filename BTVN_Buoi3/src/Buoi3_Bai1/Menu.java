package Buoi3_Bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static ArrayList<Vegetable> vt =new ArrayList<Vegetable>();
	
	public static void them() {
		Vegetable x =new Vegetable();
		x.nhap();
		vt.add(x);
	}
	
	public static void hienthiDs() {
		System.out.println("<======Danh sach rau cu======>");
		Vegetable.title();
		for (Vegetable vegetable : vt) {
			vegetable.display();
			
		}
	}

	public static void sort() {
		int n = vt.size();
		for(int i = 0;i< n-1;i++) {
			for(int j=i+1;j<n;j++)
				if(vt.get(i).getTotalRevenue() > vt.get(j).getTotalRevenue()) {
					Vegetable tmp = new Vegetable();
					tmp = vt.get(i);
					vt.set(i,vt.get(j));
					vt.set(j, tmp);
				}
			System.out.print("Ham da duoc sap xep!!!");
		}
	}
	

	public static void timKiemTheoTen() {
		System.out.print("Nhap ten rau cu can tim la:");
		Scanner sc=new Scanner(System.in);
		String ten=sc.nextLine();
		for (Vegetable vegetable : vt) {
			if(vegetable.getName().contains(ten)) {
				vegetable.display();
			}
				
			
		}
	}
	public static void mn() {
		System.out.println("menu:");
		System.out.println("1 them rau cu");
		System.out.println("2 hien thi danh sach");
		System.out.println("3 tim kiem rau cu theo ten");
		System.out.println("4 sap xep so tien thu duoc");
		System.out.println("5 Thoat");
		System.out.println("<==========================>");
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choose =0;
		do {
			mn();
			System.out.print("lua chon cua ban la :");
			choose=sc.nextInt();
			if(choose==1)
				them();
			if(choose==2) 
				hienthiDs();
			if(choose==3)
				timKiemTheoTen();
			if(choose==4)
				sort();
			if(choose==5) {
				System.out.print("chuong trinh ket thuc a !!!!!!");
				return;
			}
		}while(choose!=5);
	}
	
	
	

}

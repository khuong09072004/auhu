package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

public class Main {
	
	private static final Student Student = null;
	static StudentServiceImpl std = new StudentServiceImpl();


	
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Thêm sinh viên!");
		System.out.println("2. Hiên thị danh sách!");
		System.out.println("3. Tìm sinh viên theo ten!");
		System.out.println("4. Xóa sinh viên theo id!");
		System.out.println("5. Sắp xếp theo score!");
		System.out.println("6. Thoát chương trình");
		System.out.println("<===================>");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choose=0;
		do {
			menu();
			System.out.print("nhap lua chon cua ban:");
			choose=sc.nextInt();
			if(choose==1) 
				std.addStudent();
			if(choose==2)
				std.deleteStudent();
			if(choose==3)
				std.searchStudent();
			if(choose==4)
				std.sortStudent();
			if(choose==5)
				std.showAllStudent();
			if(choose==6) {
				
			}
				
		}

	}

}

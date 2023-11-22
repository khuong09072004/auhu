package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
	static ArrayList<Student> st= new ArrayList<Student>();
	static Scanner sc = new Scanner(System.in);
	
	public static void sortByGpa() {
		for(int i=0;i<st.size()-1;i++)
			for(int j=i+1;j<st.size();j++) {
				if(st.get(i).getGpa()>st.get(j).getGpa()) {
					Student tmp =st.get(i);
					st.set(i,st.get(j));
					st.set(j,tmp);
				}
			}
		System.out.println(" da sap xep xong");
	}
	
	public static void inputList() {
		System.out.print("Nhap vao so luong Student: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
        	System.out.println("Nhap vao thong tin Student thu " + (i + 1));
        	Student a= new Student();
        	a.input();
        	st.add(a);
        	
        	
        }
        
	}
	public static void xoaSVTheoId() {
		System.out.print("Nhap id sinh vien can xoa la:");
		int ma=sc.nextInt();
		for (Student student : st) {
			if(student.getId()==ma) {
				st.remove(student);
			System.out.println("Da xoa thanh cong a!!!");
			return;
			}
			
		}
		System.out.println("Khong tim thay sinh vien day a!!!");
	}
	
	
	public static void outputList() {
		System.out.println("<=======HIEN THI THONG TIN =======>");
		System.out.printf("%10s%20s%20s%20s%20s%20s%20s%20s%n", "Id","name","age","Commune","District","City","NameClass","GPA");
		for (Student student : st) {
			student.output();
			
		}
	}
	
	public static void menu() {
		System.out.println("<==========MENU==========>");
		 System.out.println("1.nhap thong tin sv");
		 System.out.println("2.hien thi danh sach");
		 System.out.println("3.sap xep theo GPA");
		 System.out.println("4.Xoa sinh vien theo ID");
         System.out.println("5. Thoat");
	 }

	public static void main(String[] args) {
		int choose=0;
		do {
			menu();
			System.out.print("nhap lua chon cua ban:");
			choose=sc.nextInt();
			if(choose==1)
				inputList();
			if(choose==2)
				outputList();
			if(choose==3)
				sortByGpa();
			if(choose==4)
				xoaSVTheoId();
			if(choose==5) {
				System.out.println("Da thoat chuong trinh");
				return;
			}
		}while(choose!=6);
	}

}

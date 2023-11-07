package Buoi3_Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Subject> sub= new ArrayList<Subject>();
	
public static void them() {
	Subject x=new Subject();
	x.nhap();
	sub.add(x);
}
public static void hienThiDSach() {
	System.out.println("<======Danh sach mon hoc ======>");
	Subject.title();
	for (Subject subject : sub) {
		subject.display();
	}
	
	
	
}


public static void sapXepTheo() {
	for(int i = 0;i < sub.size() - 1;i++)
		for(int j = i + 1;j < sub.size();j++)
		{
			String arr1[] = sub.get(i).getTimeEnd().split(":");
			String arr2[] = sub.get(j).getTimeEnd().split(":");
			int a = Integer.parseInt(arr1[0]);
			int b = Integer.parseInt(arr2[0]);
			int c = Integer.parseInt(arr1[1]);
			int d = Integer.parseInt(arr2[1]);


			if(a > b) {
				Subject tmp = new Subject();
				tmp=sub.get(i);
				sub.set(i, sub.get(j));
				sub.set(j, tmp);
				
			}
			if(a == b && c > d) {
				Subject tmp = new Subject();
				tmp=sub.get(i);
				sub.set(i, sub.get(j));
				sub.set(j, tmp);
				
			}
		}
}


public static void menu() {
	System.out.println("menu:");
	System.out.println("1 them mon hoc moi:");
	System.out.println("2 hien thi danh sach:");
	System.out.println("3 sap xep mon hoc");
	System.out.println("4 lua chon mon hoc");
	System.out.println("5 Thoat");
	System.out.println("<==========================>");
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choose =0;
		do {
			menu();
			System.out.print("lua chon cua ban la:");
			choose=sc.nextInt();
			if(choose==1) {
				them();
			}
			if(choose==2) {
				hienThiDSach();
			}
			if(choose==3) {
				sapXepTheo();
			}
			if(choose==4) {
			}
			if(choose==5) {
				System.out.println("chuong trinh ket thuc!!!1");
				return ;
			}
		}while(choose!=5);
				
	
		
	}

}
 
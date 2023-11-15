package Bai1;



import java.util.ArrayList;
import java.util.Scanner;

public class TestB1 {
	 static Scanner sc = new Scanner(System.in);
	 static ArrayList<Sach> list=new ArrayList<Sach>();
	 
	 public static void nhapThongTinSach() {
		 
		 System.out.print("Nhap vao so luong quyen sach: ");
         int n = sc.nextInt();
         sc.nextLine();
         for(int i=0;i<n;i++) {
        	 System.out.println("Nhap vao thong tin quyen sach thu " + (i + 1));
        	 Sach sa=new Sach();
        	sa.input();
        	list.add(sa);
        	return;

         }
         
	 }
	 public static void hienThi() {
		 System.out.println("<=======HIEN THI THONG TIN SACH=======>");
		 for (Sach sach : list) {
			sach.output();
			
		}
		
	 }
	 public static void timKiemTheoTen() {
		 System.out.print("Nhap vao ten quyen sach ban muon tim kiem: ");
         String name = sc.nextLine();
         for (Sach sach : list) {
        	 if(sach.getTenSach().equals(name)) {
        		 sach.output();
        		 return;
        	 }
		}
       System.out.println("ko tim thay ten sach!!!");
	 }
	 
	 
	 
	 
	 
	 
	 public static void sapXepTheoTenTG() {
		 System.out.println("<=========SAP XEP THU TU CAC QUYEN SACH THEO TEN TAC GIA=======>");
         list.sort((o1, o2) -> o1.getTacgia().getTenTacGia().compareTo(o2.getTacgia().getTenTacGia()));
         for (Sach sach : list) {
             sach.output();
             return;
         }
	 }
	 public static void thoat() {
		  System.out.println("Ket thuc chuong trinh.");
          return;
	 }
	 public static void menu() {
		 System.out.println("1.nhap thong tin");
		 System.out.println("2.hien thi thong tin sach");
		 System.out.println("3. Tim kiem sach");
		 System.out.println("4. Sap xep theo ten tac gia");
         System.out.println("5. Thoat");
	 }
	 
	 
	 
	 
	
	 public static void main(String[] args) {
		int choose=0;
		do {
			menu();
			System.out.print("nhap lua chon cua ban:");
			choose=sc.nextInt();
			if(choose==1)
				nhapThongTinSach();
			if(choose==2)
				hienThi();
			if(choose==3)
				timKiemTheoTen();
			if(choose==4)
				sapXepTheoTenTG();
			if(choose==5)
				thoat();
		}while(choose!=5);
	}
}
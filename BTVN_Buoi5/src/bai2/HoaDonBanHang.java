package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonBanHang {
	private String kyHieu;
	private String soHieu;
	private String ngayLapPhieu;
	private NguoiBan nguoiBan = new NguoiBan();
	private NguoiMua nguoiMua = new NguoiMua();
	private ArrayList<Hang> hang =new ArrayList<>();
	private Double tongTien;
	
public HoaDonBanHang() {
	
}

public HoaDonBanHang(String kyHieu, String soHieu, String ngayLapPhieu, NguoiBan nguoiBan, NguoiMua nguoiMua,
		ArrayList<Hang> hang, Double tongTien) {
	this.kyHieu = kyHieu;
	this.soHieu = soHieu;
	this.ngayLapPhieu = ngayLapPhieu;
	this.nguoiBan = nguoiBan;
	this.nguoiMua = nguoiMua;
	this.hang = hang;
	this.tongTien = tongTien;
}

public String getKyHieu() {
	return kyHieu;
}

public void setKyHieu(String kyHieu) {
	this.kyHieu = kyHieu;
}

public String getSoHieu() {
	return soHieu;
}

public void setSoHieu(String soHieu) {
	this.soHieu = soHieu;
}

public String getNgayLapPhieu() {
	return ngayLapPhieu;
}

public void setNgayLapPhieu(String ngayLapPhieu) {
	this.ngayLapPhieu = ngayLapPhieu;
}

public NguoiBan getNguoiBan() {
	return nguoiBan;
}

public void setNguoiBan(NguoiBan nguoiBan) {
	this.nguoiBan = nguoiBan;
}

public NguoiMua getNguoiMua() {
	return nguoiMua;
}

public void setNguoiMua(NguoiMua nguoiMua) {
	this.nguoiMua = nguoiMua;
}

public ArrayList<Hang> getHang() {
	return hang;
}

public void setHang(ArrayList<Hang> hang) {
	this.hang = hang;
}

public Double getTongTien() {
	return tongTien;
}

public void setTongTien(Double tongTien) {
	this.tongTien = tongTien;
}



public  void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("<===================NHAp THONG TIN================>");
	System.out.print("nhap ki hieu:");
	setKyHieu(sc.nextLine());
	System.out.print("nhap so hieu:");
	setSoHieu(sc.nextLine());
	System.out.print("nhap ngay lap phieu:");
	setNgayLapPhieu(sc.nextLine());
	
	System.out.println("nhap thong tin nguoi ban: ");
	nguoiBan.nhap();
	sc.nextLine();
	System.out.println("nhap thong tin nguoi mua: ");
	nguoiMua.nhap();
	
	System.out.print("nhap so luong hang can nhap la:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Nhap vao thong tin Hang thu " + (i + 1));
		Hang a=new Hang();
		a.nhap();
		hang.add(a);
	}
	
	Double tongTien=0.0;
	for (Hang hang2 : hang) {
		tongTien += hang2.getDonGia()*hang2.getSoLuong();
		
	}
	setTongTien(tongTien);
			
}

public void xuat() {
	 System.out.println("------------------------------------------------------------------------------------------------------------------------");
     System.out.printf("%70s%n", "HOA DON BAN HANG");
     System.out.printf("%80s%n%83s%n%61s%n", "Ky hieu: " + getKyHieu(), "So hoa don: " + getSoHieu(), "Ngay: " + getNgayLapPhieu());
     System.out.println("------------------------------------------------------------------------------------------------------------------------");
     nguoiBan.xuat();
     System.out.println("------------------------------------------------------------------------------------------------------------------------");
     nguoiMua.xuat();
     System.out.println("------------------------------------------------------------------------------------------------------------------------");
    
     System.out.printf("%-5s%-20s%-20s%-20s%-20s%-20s%-20s%n", "STT" ,"Ma Hang", "Ten hang hoa", "Don vi tinh", "So luong", "Don gia", "Thanh tien");
     for(int i=0; i< getHang().size();i++) {
    	 System.out.printf("%-5d%-20s%-20s%-20s%-20d%-20f%-20f%n",(i+1),getHang().get(i).getMaHang(),getHang().get(i).getTenHang(),getHang().get(i).getDonViTinh(),getHang().get(i).getSoLuong(),getHang().get(i).getDonGia(),getHang().get(i).ThanhTien());
     }
     System.out.println("------------------------------------------------------------------------------------------------------------------------");
     System.out.println("Tong tien thanh Toan: "+ getTongTien());
     System.out.printf("%-20s%-100s%n","ten nguoi mua hang","ten nguoi ban");
     System.out.printf("%-20s%-100s%n",nguoiMua.getTenNguoiMua(), nguoiBan.getTen());
     
     
     
}

public static void main(String[] args) {
	
}

}

package bai2;

import java.util.Scanner;

public class NguoiBan {
	private String ten;
	private int maSoThue;
	private String diaChi;
	private String stkNguoiBan;
	private int soDienThoai;
	
public NguoiBan() {
	
}

public NguoiBan(String ten, int maSoThue, String diaChi, String stkNguoiBan, int soDienThoai) {
	this.ten = ten;
	this.maSoThue = maSoThue;
	this.diaChi = diaChi;
	this.stkNguoiBan = stkNguoiBan;
	this.soDienThoai = soDienThoai;
}

public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public int getMaSoThue() {
	return maSoThue;
}

public void setMaSoThue(int maSoThue) {
	this.maSoThue = maSoThue;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public String getStkNguoiBan() {
	return stkNguoiBan;
}

public void setStkNguoiBan(String stkNguoiBan) {
	this.stkNguoiBan = stkNguoiBan;
}

public int getSoDienThoai() {
	return soDienThoai;
}

public void setSoDienThoai(int soDienThoai) {
	this.soDienThoai = soDienThoai;
}

public void nhap() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print(" nhap ten nguoi ban hang: ");
	 setTen(sc.nextLine());
	 System.out.print(" nhap ma so thue: ");
	 setMaSoThue(sc.nextInt());
	 sc.nextLine();
	 System.out.print(" nhap dia chi nguoi ban: ");
	 setDiaChi(sc.nextLine());
	 System.out.print(" nhap so tai khoan nguoi ban: ");
	 setStkNguoiBan(sc.nextLine());
	 System.out.print(" nhap sdt nguoi ban hang: ");
	 setSoDienThoai(sc.nextInt());
	 sc.nextLine();
	 
}

public void xuat() {
	System.out.println("ten nguoi ban la:"+getTen());
	System.out.println("ma so thue la:"+getMaSoThue());
	System.out.println("dia chi nguoi ban la:"+getDiaChi());
	System.out.println("so tai khoan nguoi ban la:"+getStkNguoiBan());
	System.out.println("sdt nguoi ban la:"+getSoDienThoai());
}
}


package bai2;

import java.util.Scanner;

public class Hang {
	private String maHang;
	private String tenHang;
	private String donViTinh;
	private int soLuong;
	private float donGia;
	
public Hang() {
	
}

public Hang(String maHang, String tenHang, String donViTinh, int soLuong, float donGia) {
	this.maHang = maHang;
	this.tenHang = tenHang;
	this.donViTinh = donViTinh;
	this.soLuong = soLuong;
	this.donGia = donGia;
}

public String getMaHang() {
	return maHang;
}

public void setMaHang(String maHang) {
	this.maHang = maHang;
}

public String getTenHang() {
	return tenHang;
}

public void setTenHang(String tenHang) {
	this.tenHang = tenHang;
}

public String getDonViTinh() {
	return donViTinh;
}

public void setDonViTinh(String donViTinh) {
	this.donViTinh = donViTinh;
}

public int getSoLuong() {
	return soLuong;
}

public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}

public double getDonGia() {
	return donGia;
}

public void setDonGia(float donGia) {
	this.donGia = donGia;
}

public void nhap() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print(" nhap ma hang: ");
	 setMaHang(sc.nextLine());
	 System.out.print(" nhap ten hang: ");
	 setTenHang(sc.nextLine());
	 System.out.print(" nhap don vi tinh: ");
	 setDonViTinh(sc.nextLine());
	 System.out.print(" nhap so luong: ");
	 setSoLuong(sc.nextInt());
	 sc.nextLine();
	 System.out.print(" nhap don gia: ");
	 setDonGia(sc.nextFloat());
	 
}

public void xuat() {
	System.out.printf("%10s%10s%10s%10d%10f%10f",getMaHang(),getTenHang(),getDonViTinh(),getSoLuong(),getDonGia(),ThanhTien());
}

public Double ThanhTien() {
	return getSoLuong()*getDonGia();
}

}

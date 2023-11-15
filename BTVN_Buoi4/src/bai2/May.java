package bai2;

import java.util.Scanner;

public class May {
	private int maMay;
	private String kieuMay;
	private String tinhTrang;
public May() {
	
}
public May(int maMay, String kieuMay, String tinhTrang) {
	this.maMay = maMay;
	this.kieuMay = kieuMay;
	this.tinhTrang = tinhTrang;
}
public int getMaMay() {
	return maMay;
}
public void setMaMay(int maMay) {
	this.maMay = maMay;
}
public String getKieuMay() {
	return kieuMay;
}
public void setKieuMay(String kieuMay) {
	this.kieuMay = kieuMay;
}
public String getTinhTrang() {
	return tinhTrang;
}
public void setTinhTrang(String tinhTrang) {
	this.tinhTrang = tinhTrang;
}
public void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("<==Nhập máy==>");
	System.out.print("Nhap ma May la:");
    setMaMay(sc.nextInt());
    sc.nextLine();
    System.out.print("nhap kieu May la:");
    setKieuMay(sc.nextLine());
    System.out.print("nhap tinh trang may la:");
    setTinhTrang(sc.nextLine());
}
public void output() {
	System.out.println("ma may la: "+getMaMay());
	System.out.println("kieu may la: "+getKieuMay());
	System.out.println("tinh trang may la: "+getTinhTrang());
}





}

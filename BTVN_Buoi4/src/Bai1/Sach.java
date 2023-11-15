package Bai1;

import java.util.Scanner;

public class Sach {
	static int count =0;
	private int id;
	private String tenSach;
	private int namXuatBan;
	private String theLoai;
	private TacGia tacGia ;
	
public Sach() {
	
}

public Sach(int id, String tenSach, int namXuatBan, String theLoai, TacGia tacgia) {
	count++;
	this.id = count;
	this.tenSach = tenSach;
	this.namXuatBan = namXuatBan;
	this.theLoai = theLoai;
	this.tacGia = tacgia;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTenSach() {
	return tenSach;
}

public void setTenSach(String tenSach) {
	this.tenSach = tenSach;
}

public int getNamXuatBan() {
	return namXuatBan;
}

public void setNamXuatBan(int namXuatBan) {
	this.namXuatBan = namXuatBan;
}

public String getTheLoai() {
	return theLoai;
}

public void setTheLoai(String theLoai) {
	this.theLoai = theLoai;
}

public TacGia getTacgia() {
	return tacGia;
}

public void setTacgia(TacGia tacgia) {
	this.tacGia = tacgia;
}

public void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("<===NHAP VAO THONG TIN SACH===>");
	System.out.print("Nhap ten sach la:");
	setTenSach(sc.nextLine());
	System.out.print("Nhap nam xua ban la:");
	setNamXuatBan(sc.nextInt());
	sc.nextLine();
	System.out.print("Nhap the loai sach la:");
	setTheLoai(sc.nextLine());
    System.out.println("NHAP VAO THONG TIN TAC GIA: ");
    TacGia a= new TacGia();
    a.input();
    this.tacGia=a;
}

public void output(){
	System.out.println("ID: " + getId());
    System.out.println("Ten sach: " +getTenSach());
    System.out.println("Nam xuat ban: " + getNamXuatBan());
    System.out.println("The loai: " + getTheLoai());
    System.out.println("Thong tin tac gia: ");
    tacGia.output();
    System.out.println("<=======================>");
    
}

}

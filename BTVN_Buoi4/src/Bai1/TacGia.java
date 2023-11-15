package Bai1;

import java.util.Scanner;

public class TacGia {
private String tenTacGia;
private int namSinh;
public TacGia() {
	
}
public TacGia(String tenTacGia, int namSinh) {
	this.tenTacGia = tenTacGia;
	this.namSinh = namSinh;
}
public String getTenTacGia() {
	return tenTacGia;
}
public void setTenTacGia(String tenTacGia) {
	this.tenTacGia = tenTacGia;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}

public void input() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap ten tac gia la: ");
    this.setTenTacGia(sc.nextLine());
    System.out.print("nhap nam sinh tac gia la:");
    this.setNamSinh(sc.nextInt());
    sc.nextLine();
    
}

public void output() {
	System.out.println("ten tac gia: "+ this.getTenTacGia());
	System.out.println("nam sinh tac gia: "+ this.getNamSinh());
	
}
}
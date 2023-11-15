package bai2;

import java.util.Scanner;

public class QuanLy {
	private String maQL;
	private String tenQL;
public QuanLy() {
		
}
public QuanLy(String maQL, String tenQL) {
	
	this.maQL = maQL;
	this.tenQL = tenQL;
}
public String getMaQL() {
	return maQL;
}
public void setMaQL(String maQL) {
	this.maQL = maQL;
}
public String getTenQL() {
	return tenQL;
}
public void setTenQL(String tenQL) {
	this.tenQL = tenQL;
}
public void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("<==Nhập quản lý==>");
	System.out.print("Nhap ma Quan Li la:");
    setMaQL(sc.nextLine());
    System.out.print("nhap ten Quan Li la:");
    setTenQL(sc.nextLine());
}
public void output() {
	System.out.println(" ma QL la:" + getMaQL());
	System.out.println(" ten QL la:" + getTenQL());
}

}

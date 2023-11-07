package bai3;

import java.util.Scanner;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	
	public HinhChuNhat(){
		
	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	




	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}
	public double tinhChuVi() {
		return (chieuDai+chieuRong)*2;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", dien tich la:" + tinhDienTich() + ", chu vi la:" + tinhChuVi() + "]";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai:");
		chieuDai = sc.nextFloat();
		System.out.print("Nhap chieu rong:");
		chieuRong = sc.nextFloat();	
		
	}
	public void xuat() {
		System.out.println("chieu dai la:" +chieuDai);
		System.out.println("chieu rong la:"+ chieuRong);
		
	}
	public static void main(String[] args) {
		HinhChuNhat x = new HinhChuNhat(2, 2);
		System.out.println(	x.getChieuDai());
		x.setChieuDai(3);
		System.out.println("Dien Tich la:" + x.tinhDienTich());
//		x.nhap();
//		x.xuat();
		HinhChuNhat y = new HinhChuNhat();
		y.nhap();
		y.xuat();
		int a = 5;
		System.out.println(y.tinhChuVi());
	
	}

}

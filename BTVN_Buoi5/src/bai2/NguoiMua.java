package bai2;

import java.util.Scanner;

public class NguoiMua {
	private String hoNguoiMua;
	private String tenNguoiMua;
	private String diaChi;
	private String stkNguoiMua;
	private String hinhThucThanhToan;
	private String mst;
	
public NguoiMua() {
	
}

public NguoiMua(String hoNguoiMua, String tenNguoiMua, String diaChi, String stkNguoiMua, String hinhThucThanhToan,
		String mst) {
	this.hoNguoiMua = hoNguoiMua;
	this.tenNguoiMua = tenNguoiMua;
	this.diaChi = diaChi;
	this.stkNguoiMua = stkNguoiMua;
	this.hinhThucThanhToan = hinhThucThanhToan;
	this.mst = mst;
}

public String getHoNguoiMua() {
	return hoNguoiMua;
}

public void setHoNguoiMua(String hoNguoiMua) {
	this.hoNguoiMua = hoNguoiMua;
}

public String getTenNguoiMua() {
	return tenNguoiMua;
}

public void setTenNguoiMua(String tenNguoiMua) {
	this.tenNguoiMua = tenNguoiMua;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public String getStkNguoiMua() {
	return stkNguoiMua;
}

public void setStkNguoiMua(String stkNguoiMua) {
	this.stkNguoiMua = stkNguoiMua;
}

public String getHinhThucThanhToan() {
	return hinhThucThanhToan;
}

public void setHinhThucThanhToan(String hinhThucThanhToan) {
	this.hinhThucThanhToan = hinhThucThanhToan;
}

public String getMst() {
	return mst;
}

public void setMst(String mst) {
	this.mst = mst;
}
public void nhap() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print(" nhap ho nguoi mua hang: ");
	 setHoNguoiMua(sc.nextLine());
	 System.out.print(" nhap ten nguoi mua hang: ");
	 setTenNguoiMua(sc.nextLine());
	 System.out.print(" nhap dia chi nguoi mua hang: ");
	 setDiaChi(sc.nextLine());
	 System.out.print(" nhap stk nguoi mua hang: ");
	 setStkNguoiMua(sc.nextLine());
	 System.out.print("nhap hinh thuc thanh toan: ");
	 setHinhThucThanhToan(sc.nextLine());
	 System.out.print(" nhap mst: ");
	 setMst(sc.nextLine());
}

public void xuat() {
	System.out.println("ho nguoi mua hang la:"+getHoNguoiMua());
	System.out.println("ten nguoi mua hang la:"+getTenNguoiMua());
	System.out.println("dia chi nguoi mua hang la:"+getDiaChi());
	System.out.println("stk nguoi mua hangla:"+getStkNguoiMua());
	System.out.println("hinh thuc thanh toan la:"+getHinhThucThanhToan());
	System.out.println("mst la:"+getMst());
}
}

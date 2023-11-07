package Buoi3_Bai1;

import java.util.Scanner;

public class Vegetable {
	private String id;
	private String name;
	private String unit;
	private int quantitySold;
	private int sale;
	private double price;
	
	public Vegetable() {
		
	}
	

	

	public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
		super();
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.quantitySold = quantitySold;
		this.sale = sale;
		this.price = price;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getUnit() {
		return unit;
	}




	public void setUnit(String unit) {
		this.unit = unit;
	}




	public int getQuantitySold() {
		return quantitySold;
	}




	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}




	public int getSale() {
		return sale;
	}




	public void setSale(int sale) {
		this.sale = sale;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public void display() {
		System.out.printf("%20s%20s%20d%20d%27f%20f%n", getId(), getName(), getQuantitySold() , getSale(), getPrice(), getTotalRevenue());
	}
	
	public static void title() {
		System.out.printf("%20s%20s%20s%20s%25s%18s%n", "ID","Name", "QuantitySold" , "Sale", "Price", "Total amount");
		
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap id la:");
		setId(sc.nextLine());
		System.out.print("Nhap ten loai rau cu moi la:");
		setName(sc.nextLine());
		System.out.print("So luong da ban la: ");
		setQuantitySold(sc.nextInt());
		System.out.print("phan tram giam gia la: ");
		setSale(sc.nextInt());
		System.out.print("gia goc: ");
		setPrice(sc.nextDouble());
		
	}

	public double getTotalRevenue() {
		return getQuantitySold()*getPrice()*getSale();
	}
	
	

}

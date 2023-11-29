package Bai2;

import java.util.Scanner;

public class Address {
	private String district;
	private String city;
	
	public Address() {
		
	}

	public Address(String district, String city) {
		this.district = district;
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap district:");
		setDistrict(sc.nextLine());
		System.out.print("nhap city:");
		setCity(sc.nextLine());
		
		
		
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", city=" + city + "]";
	}
	
	

}

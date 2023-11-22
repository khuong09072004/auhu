package Bai1;

import java.util.Scanner;

public class Address {
private String commune;
private String district;
private String city;

public Address() {
	
}

public Address(String commune, String district, String city) {
	this.commune = commune;
	this.district = district;
	this.city = city;
}

public String getCommune() {
	return commune;
}

public void setCommune(String commune) {
	this.commune = commune;
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
	Scanner sc= new Scanner(System.in);
	System.out.print("nhap commune:");
	setCommune(sc.nextLine());
	System.out.print("nhap district:");
	setDistrict(sc.nextLine());
	System.out.print("nhap city:");
	setCity(sc.nextLine());
	
}

public void output() {
	System.out.printf("%20s%20s%20s",getCommune(),getDistrict(),getCity());
}



}

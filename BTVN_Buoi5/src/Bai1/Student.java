package Bai1;

import java.util.Scanner;

public class Student extends Person{
	private int id;
	private String nameClass;
	private float gpa;
	final float criteria=2;
	
public Student() {
	
}

public Student(int id, String nameClass, float gpa,String name, int age, Address address) {
	super(name,age,address);
	this.id = id;
	this.nameClass = nameClass;
	this.gpa = gpa;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNameClass() {
	return nameClass;
}

public void setNameClass(String nameClass) {
	this.nameClass = nameClass;
}

public float getGpa() {
	return gpa;
}

public void setGpa(float gpa) {
	this.gpa = gpa;
}

public float getCriteria() {
	return criteria;
}
@Override
public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("<===NHAP VAO THONG TIN===>");
	System.out.print("nhap id:");
	setId(sc.nextInt());
	super.input();
	System.out.print("nhap nameClass:");
	setNameClass(sc.nextLine());
	sc.nextLine();
	System.out.print("nhap gpa:");
	setGpa(sc.nextFloat());
	sc.nextLine();
	
}
@Override
public void output() {
	System.out.printf("%10d",getId());
	super.output();
	System.out.printf("%20s%20f%n",getNameClass(),getGpa());
	
	
}

public boolean checkFall(){
	if(getGpa()<getCriteria())
		return true;
	else
		return false;
}


}

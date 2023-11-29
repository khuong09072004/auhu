package Bai2;

import java.util.Scanner;

public abstract class Person {
	private int id;
	private static int count =1;
	private String name;
	private short age;
	private Address address;
	
	public Person() {
		count ++;
	}

	public Person(int id, String name, short age, Address address) {
		count ++;
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("nhap ten:");
		setName(sc.nextLine());
		System.out.print("nhap age:");
		setAge(sc.nextShort());
		sc.nextLine();
		System.out.println("nhap thong tin dia chi:");
		Address a= new Address();
		a.input();
		this.address=a;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public abstract String getCapacity();
	 

	

}

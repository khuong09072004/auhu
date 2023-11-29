package Bai2;

import java.util.Scanner;

public class Student extends Person{
	private double score;

	public Student() {
		
	}
	

	public Student(double score,int id, String name, short age, Address address) {
		super(id,name,age,address);
		this.score = score;
	}
	


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}
	
	public void input() {
		Scanner sc= new Scanner(System.in);
		super.input();
		System.out.print("nhap score:");
		setScore(sc.nextDouble());
		sc.nextLine();
	}
	


	@Override
	public String toString() {
		return super.toString()+ "Student [score=" + score +",capacity="+getCapacity()+ "]";
	}


	@Override
	public String getCapacity() {
		if(getScore()>10)
			return "ko co diem tren 10";
		if(getScore()>=9&&getScore()<=10) 
			return "hoc luc xuat sac";
		else if(getScore()<9&&getScore()>=8)
			return "hoc luc gioi";
		else if(getScore()<8&&getScore()>=6.5)
			return "hoc luc kha";
		else
			return"hoc luc trung binh yeu";
		
	}
	

}

package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person implements Displayable {
	static Scanner sc= new Scanner(System.in);
	protected int age;
	protected String grade;
	protected List<Course> courseList ;
	

	

	public Student(int age, String grade,int id,String name) {
		super(id,name);
		this.age = age;
		this.grade = grade;
		this.courseList =new ArrayList<Course>();
	}
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String arade) {
		this.grade = grade;
	}


	public List<Course> getCourseList() {
		return courseList;
	}


	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	 public void enroll(Course course) {
	        courseList.add(course);
	    }
	@Override
	public void displayInfo() {
		System.out.println("Thong tin sinh vien:");
		System.out.println("ID:"+getId());
		System.out.println("ID:"+getName());
		System.out.println("ID:"+getAge());
		System.out.println("ID:"+getGrade());
		
	}



}

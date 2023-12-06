package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course implements Displayable {
	protected int courseID;
	protected String courseName;
	protected List<Student> listStudent;
	
	

	public Course(int courseID , String courseName) {
		this.courseID = courseID;
		this.courseName = courseName;
		
	}
	



	public int getCourseID() {
		return courseID;
	}




	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}




	public String getCourseName() {
		return courseName;
	}




	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}




	public List<Student> getListStudent() {
		return listStudent;
	}




	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}





	@Override
	public void displayInfo() {
		System.out.println("Thong tin khoa hoc");
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Thong tin Sudent tham gia khoa hoc: ");
        for (Student student : listStudent) {
        	student.displayInfo();
		}
	}

}

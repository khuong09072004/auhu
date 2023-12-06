package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
	protected List<Student>student1;
	protected List<Course> course1;
	

	public University() {
		this.student1 = new ArrayList<>();
		this.course1 =  new ArrayList<>();
	}

	public List<Student> getStudent1() {
		return student1;
	}

	public void setStudent1(List<Student> student1) {
		this.student1 = student1;
	}

	public List<Course> getCourse1() {
		return course1;
	}

	public void setCourse1(List<Course> course1) {
		this.course1 = course1;
	}
	
	public void getStudent() {
		 System.out.println("Tat Ca Hoc Sinh Trong Truong La:");
		 for (Student student : student1) {
			 student.displayInfo();
		}
	}
	public void getCourse() {
		System.out.println("Tat Ca Khoa Hoc La:");
		for (Course course : course1) {
			course.displayInfo();
			
		}
	}
	public void addStudent(Student student) {
		student1.add(student);

	}
	public void addCourse(Course course) {
		course1.add(course);
		
	}
	

    
     
        
        

		
	
	

}

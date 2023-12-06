package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBai7 {
	
     static University university = new University();
	 static Scanner sc= new Scanner(System.in);
	 public static void menu() {
	        System.out.println("----------------------Menu----------------------");
	        System.out.println("1. Hien Thi Tat Ca Sinh Vien Cua Truong");
	        System.out.println("2. Hien Thi Cac Khoa Hoc Trong Truong");
	        System.out.println("3. Them Sinh Vien");
	        System.out.println("4. Xoa Sinh Vien");
	        System.out.println("5. Them Khoa Hoc");
	        System.out.println("6. Xoa Khoa Hoc");
	        System.out.println("7. Dang Ky Khoa Hoc Cho Sinh Vien");
	        System.out.println("0. Thoat");
	        System.out.println("------------------------------------------------");
	        System.out.print("Nhap Lua Chon Cua Ban : ");
	    }
	 public static void getStudents() {
	        university.getStudent();
	    }
	 public static void getCourses() {
		 university.getCourse();
	 }
	 
	 public static void addStudent() {
		    System.out.print("Nhap ID : ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Nhap Name : ");
	        String name = sc.nextLine();
	        System.out.print("Nhap Age : ");
	        int age = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Nhap Grade : ");
	        String grade = sc.nextLine();
	        
			Student student = new Student(age, grade, id, name);
			university.addStudent(student);
	 }
		public static void removeStudent() {
			System.out.println("nhap id student can xoa:");
			int ma=sc.nextInt();
			for (Student student : university.getStudent1()) {
				if(student.getId()==ma) {
					university.getStudent1().remove(student);
					System.out.println("Da xoa xong!!!");
					return;
				}
				
			}
			System.out.println("Khong tim thay student day a!!!");
		}
		public static void addCourse() {
			    System.out.print("Nhap Course ID : ");
		        int courseID = sc.nextInt();
		        sc.nextLine();
		        System.out.print("Nhap Course Name : ");
		        String courseName = sc.nextLine();
		        Course course=new Course(courseID, courseName);
		        university.addCourse(course);
		}
		public static void removeCourse() {
			System.out.println("nhap id Course can xoa:");
			int maCourse=sc.nextInt();
			for (Course course : university.getCourse1()) {
				if(course.getCourseID()==maCourse) {
					university.getCourse1().remove(course);
					System.out.println("Da xoa xong!!!");
					return;
				}
				
			}
			System.out.println("Khong tim thay id course day a!!!");
		}
	 
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose=0;
		do {
			menu();
			choose=sc.nextInt();
			if(choose==1) {
				getStudents();
			}
			if(choose==2) {
				getCourses();
			}
			if(choose==3) {
				addStudent();
			}
			if(choose==4) {
				 removeStudent();
			}
			if(choose==5) {
				addCourse();
			}
			if(choose==6) {
				removeCourse();
			}
				
		}while(choose!=7);
		

	}

}

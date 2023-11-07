package Buoi3_Bai2;

import java.util.Scanner;

public class Subject {
private String id;
private String SubjectName;
private int studentCount;
private String timeStart;
private String timeEnd;

public Subject(){
	
}

public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
	this.id = id;
	SubjectName = subjectName;
	this.studentCount = studentCount;
	this.timeStart = timeStart;
	this.timeEnd = timeEnd;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getSubjectName() {
	return SubjectName;
}

public void setSubjectName(String subjectName) {
	SubjectName = subjectName;
}

public int getStudentCount() {
	return studentCount;
}

public void setStudentCount(int studentCount) {
	this.studentCount = studentCount;
}

public String getTimeStart() {
	return timeStart;
}

public void setTimeStart(String timeStart) {
	this.timeStart = timeStart;
}

public String getTimeEnd() {
	return timeEnd;
}

public void setTimeEnd(String timeEnd) {
	this.timeEnd = timeEnd;
}

public void nhap() {
	Scanner sc= new Scanner(System.in);
	System.out.print("nhap id:");
	String id=sc.nextLine();
	System.out.print("nhap ten:");
	setSubjectName(sc.nextLine());
	System.out.print("nhap so luong hoc sinh:");
	setStudentCount(sc.nextInt());
	sc.nextLine();
	System.out.println("nhap thoi gian bat dau tiet hoc:");
	setTimeStart(sc.nextLine());
	System.out.print("nhap thoi gian ket thuc tiet hoc:");
	setTimeEnd(sc.nextLine());
	
	
}

public void display() {
	System.out.printf("%20s%20s%20d%18s%n", getId(), getSubjectName(), getStudentCount() , getTimeStart()+"-"+ getTimeEnd());
}
public static void title() {
	System.out.printf("%20s%20s%20s%18s%n", "ID","SubjectName", "StudentCount" , "TimeStart-End" );
}




}

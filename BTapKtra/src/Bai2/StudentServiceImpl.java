package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{
	static ArrayList<Student> list= new ArrayList<>();
	static Scanner sc= new Scanner(System.in);
	
	

	@Override
	public void addStudent() {
		Student t1= new Student();
		t1.input();
		list.add(t1);
		
	}

	@Override
	public void deleteStudent() {
		System.out.print("nhap id can xoa la:");
		int id=sc.nextInt();
		for (Student student : list) {
			if(student.getId()==id) {
				list.remove(id);
				return;
			}
			System.out.println("Da xoa xong!!");
		}
		
	}

	@Override
	public void searchStudent() {
		System.out.print("nhap ten sinh vien can tim kiem:");
		 String name = sc.nextLine();
		for (Student student : list) {
			if(student.getName().equals(name))
				System.out.println(student.toString());
			    return;
		}
		
	}

	@Override
	public void sortStudent() {
		for(int i=0;i<list.size()-1;i++)
			for(int j=i+1;j<list.size();j++)
				if(list.get(i).getScore()<list.get(j).getScore()) {
					Student tmp=list.get(i);
					list.set(i,list.get(j));
					list.set(j, tmp);
				}
		System.out.println("Da sap xep xong !!!!!");
		
	}

	@Override
	public void showAllStudent() {
		System.out.println("<=====Danh sach sinh vien la:");
		for (Student student : list) {
			System.out.println(student.toString());
			
		}
	}
	

}

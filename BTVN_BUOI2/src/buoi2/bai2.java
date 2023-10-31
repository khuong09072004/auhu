package buoi2;

import java.util.Scanner;

public class bai2 {

	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang:");
		int n = sc.nextInt();
		int [] a=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("nhap vao phan tu thu "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		System.out.println("xuat cac phan tu trong mang la:");
		for (int x : a) 
   	       System.out.println(x);
		
		System.out.print("nhap so luong can truy van: ");
		int q=sc.nextInt();
		
	while(q-->0) {
		System.out.print("nhap l:");
		int l=sc.nextInt();
		System.out.print("nhap r:");
		int r=sc.nextInt();
		
		int sum=0;
		for(int i=l-1;i<r;i++)
			sum+=a[i];
		System.out.println("tong tu "+l+" den "+r+" la: "+sum);
	}
		
    
		
	}

}

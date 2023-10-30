package buoi2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		nhap gia tri n
		System.out.print("nhap so phan tu n: ");
		 int n =sc.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++) {
			 System.out.print("nhap phan tu thu "+(i+1)+" = ");
			 a[i]=sc.nextInt();
		 }
//		 xuat cac pt trong mang
		 for(int i=0;i<n;i++) {
			 System.out.println(a[i]+" ");
		 }
//		 nhap vao so luong can truy van
		 System.out.print("nhap vao so luong pt can truy van: ");
		 int q=sc.nextInt();
		 
		 if(q<0||q>n) {
			 System.out.println("vui long nhap so luong pt truy van dung");
		 }
		 else {
			 System.out.print("nhap vao pt L:");
			 int L=sc.nextInt();
			 System.out.print("nhap vao pt R:");
			 int R=sc.nextInt();
			 
			 int sum=0;
			 for(int i=L-1;i<R;i++) {
				 sum+=a[i];
			 }
			 System.out.print("tong phan tu tu " +L+" toi "+R+" la: "+sum);
		 }
	}

}

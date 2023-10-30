package buoi2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Nhap so phan tu :");
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i = 0;i<n;i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + " = ");
			a[i]=sc.nextInt();
		}
		
		int sum,tong=1, value = 0 ;
		for(int i=0;i<n;i++) {
			sum = 1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j])
				sum++;
			}
			if(tong <= sum) {
				value = a[i];
				tong = sum;
			}
		}
			int dem;
		for(int i = 0;i < n;i++) {
			dem=1;
			for(int j = i + 1;j < n;j++) {
				if(a[i] == a[j])
					dem++;
			}
			if(dem == tong)
			{
				System.out.println("gia tri xh nhieu nhat"+a[i]);
				System.out.println("so lan xh nhieu nhat la:"+dem);
			}
		}
         
	}

}


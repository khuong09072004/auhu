package buoi1;
import java.util.Scanner;
public class bai2 {

	 public static String DoiCoSo(int a, int b) {
	     if(a==0) {
	    	 return "0";
	     }
	        String ans="";
	        while(a>0)
	        {
	            if(a%b== 10) {ans='A'+ans;}
	            else if(a%b== 11) {ans='B'+ans;}
	            else if(a%b== 12) {ans='C'+ans;}
	            else if(a%b== 13) {ans='D'+ans;}
	            else if(a%b== 14) {ans='E'+ans;}
	            else if(a%b== 15) {ans='F'+ans;}
	            else {ans=a%b+ans;}
	            a/=b;
	        }
	        return ans;
	    }
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Nhập số tự nhiên ở hệ cơ số 10: ");
	        int a=sc.nextInt();
	        System.out.print("Nhập hệ cơ số muốn chuyển đổi (2 ≤ b ≤ 16): ");
	        int b=sc.nextInt();
	        if(b<2|| b>16) {
	        	System.out.println("Hệ cơ số không hợp lệ.");
	        } else {
	        System.out.println("Số hệ "+b+": "+DoiCoSo(a,b));
	        }
	    }
	}

package buoi2;
import java.util.Scanner;

public class bai4 {

	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Nhập xâu: ");
	        String s= sc.nextLine().toLowerCase();
	        boolean[] f=new boolean[200];
	        char[] c= s.toCharArray();
	        for(int i=0;i<=25;i++) 
            f[i]=false;
        
	        for(int i = 0;i < s.length();i++) 
	        	f[122 - (int)c[i]] = true;
	        
	        
	        boolean kq = true;
	        for(int i = 0;i <= 25;i++)
	        	if(f[i] == false) {
	        		kq = false;
	        		break;
	        	}
	        		
	        if(kq)
	        System.out.println("YES");
	        else 
	        	System.out.println("NO");

	        
	    }
	}
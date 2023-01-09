package Functions;

import java.util.Scanner;

public class FibonacciMember {
	
	public static void FibonacciMember(int n) {
		
		int a=0,b=1;
		 while(a<n) {
			int c=a+b;
			a=b;
			b=c;
		 }
		 
		 if(a==n) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		FibonacciMember(n);

	}

}

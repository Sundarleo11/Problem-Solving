package Functions;

import java.util.Scanner;

public class FibonacciNthnumber {
	
	public static void FibonacciMember(int n) {
		int i=1;
		int a=1,b=1;
		 for(i=1; i<n; i++) {
			int c=a+b;
			a=b;
			b=c;
			
		 }
		 System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		FibonacciMember(n);

	}

}

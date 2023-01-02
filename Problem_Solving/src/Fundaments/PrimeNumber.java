package Fundaments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int i=1;
		boolean isprime=true;
		int div=2;
		
		while(div<=(n-1)) {
			if(n%div==0) {
				isprime=false;
			}
			div++;
		}
		
		if(isprime) {
			System.out.println("PrimeNumer");
		}else {
			System.out.println("composite");
		}
		

	}

}

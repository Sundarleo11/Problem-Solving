package Fundaments;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		 n=sc.nextInt();
		
	
		int i=1;
		int sum=0;
		while(n>=i) {
	
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of number : "+sum);

	}

}

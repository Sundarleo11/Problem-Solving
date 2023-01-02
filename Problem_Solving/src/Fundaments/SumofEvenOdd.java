package Fundaments;

import java.util.Scanner;

public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 1234
		 * 
		 * n=n/10
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
	     
		int oddsum=0,evensum=0;
		
		while(num>0) {
			int last=num%10;
			if(last%2==0) {
				evensum+=last;
				
			}else {
				oddsum+=last;
			}
			 num=num/10;
		}
		
		System.out.println(evensum +" "+ oddsum);
		

	}

}

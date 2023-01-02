package Fundaments;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + "Even"); 
			
			
		} else {
			System.out.println(a + "Odd");
		}

		System.out.println("outer if");
		
		//block functionality 
		///========================================
		
		int x=15;
		if(x>=15) {
			System.out.println("inside if");
		}else if(x==15){
			System.out.println("else if");
		}
		System.out.println(x);
		
		
		// variable functionality
		int var1=5;
		int var2=6;
		if((var2=1)==var1)
			System.out.println(var1);
		
		else
			System.out.println(var2+1);
			
	}
	
	

}

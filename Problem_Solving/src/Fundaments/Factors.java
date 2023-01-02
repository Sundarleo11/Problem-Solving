package Fundaments;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factors as i
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		//System.out.println("no factore");

	}

}

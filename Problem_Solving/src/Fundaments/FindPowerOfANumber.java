package Fundaments;

import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int base;
		int power;
		
		 base=sc.nextInt();
         power=sc.nextInt();
         
         int Ans=(int) Math.pow(base, power);
         System.out.println(Ans);
		

	}

}

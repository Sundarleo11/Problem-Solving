package Functions;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime;
		for (int i = 2; i <=n; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}
				
			}
			if(isPrime==true)
				System.out.println(i);
		}
		

	}

}

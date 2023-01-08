package Patterns;

import java.util.Scanner;

public class Isosceles_Triangle_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				for(int L=i;L>1;L--) {
				   int M=L-1;
					if(true) {
						System.out.print("*");

					}
									}
				System.out.println();
			}
				
				

	}

}

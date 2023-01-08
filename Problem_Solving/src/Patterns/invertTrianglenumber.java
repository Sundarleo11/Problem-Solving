package Patterns;

import java.util.Scanner;

public class invertTrianglenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(n-i+1);
			}for(int k=1;k<=n;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}

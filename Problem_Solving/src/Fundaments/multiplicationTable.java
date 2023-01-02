package Fundaments;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
		}

	}

}

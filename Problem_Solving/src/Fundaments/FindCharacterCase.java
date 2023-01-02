package Fundaments;

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 1, if the character is an uppercase alphabet (A - Z) 0, 
		 * 
		 * if the character is a
		 * 
		 * lowercase alphabet (a - z) -1,
		 * 
		 *  if the character is not an alphabet
		 */
		char x=sc.next().charAt(0);
		if(x >=65 && x<=90 ) {
			System.out.println(1);
		}else if(x >=97 && x<=122) {
			System.out.println(-1);
		}else {
			System.out.println("is not an alphabet");
		}

	}

}

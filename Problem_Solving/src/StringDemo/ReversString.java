package StringDemo;

import java.util.Scanner;

public class ReversString {
	
	public static void ReversString(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ReversString(str);
		

	}

}

package StringDemo;

import java.util.Scanner;

public class PrintAllChar {
	
	public static void PrintAllChar(String str1) {
		
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        PrintAllChar(str1);
	}

}

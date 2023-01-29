package StringDemo;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean Palindrome(String str) {
		boolean isPalindrome=true;
		for(int i=0,j=str.length()-1;i<(str.length()/2);i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPalindrome=false;
						break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean ispalindrome=Palindrome(str);
		System.out.println(ispalindrome);
		

	}

}

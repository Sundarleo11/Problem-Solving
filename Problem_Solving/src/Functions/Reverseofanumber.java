package Functions;

import java.util.Scanner;

public class Reverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,rev=0;
		while(temp>0) {
			int  Last_digit=temp%10;                  
			temp=temp/10;                 
			rev=rev*10+Last_digit;
			System.out.println("num: "+rev);
		}
      System.out.println(rev);
	}

}

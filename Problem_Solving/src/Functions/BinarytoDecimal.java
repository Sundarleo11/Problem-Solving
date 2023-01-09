package Functions;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int d=0,pow=1;
		int i=1;
		while(n!=0) {
			int last=n%10;
			d+=last*pow;
			pow*=2;
			n=n/10;
		}
       System.out.print(d);
	}

}

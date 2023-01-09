package Functions;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int binary=0,pr=1;
		while(n>0) {
			int last=n%2;
			binary+=last*pr;
			pr*=10;
			n=n/2;
			
		}
       System.out.print(binary);
	}

	

}

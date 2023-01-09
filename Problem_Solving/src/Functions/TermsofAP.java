package Functions;

import java.util.Scanner;

public class TermsofAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;) {
			int x=((3*c)+2);
			if(x%4!=0) {
				System.out.print(x+" ");
				i++;
			}
			c++;
		}

	}

}

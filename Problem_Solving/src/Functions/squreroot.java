package Functions;

import java.util.Scanner;

public class squreroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		while(x*x<=n) {
			x+=1;
		}
       System.out.println(x-1);
	}

}

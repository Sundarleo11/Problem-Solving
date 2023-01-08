package Functions;

import java.util.Scanner;

public class NSR {

	public static int fact(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int factN=fact(n);
		int factR=fact(r);
		int factNR=fact(n-r);
		
		/*
		 * int factN=1; for(int i=1;i<=n;i++) { factN=factN*i;
		 * 
		 * }
		 * 
		 * int factR=1; for(int i=1;i<=r;i++) { factR=factR*i;
		 * 
		 * }
		 * 
		 * int factNR=1; for(int i=1;i<=n-r;i++) { factNR=factNR*i;
		 * 
		 * }
		 */

		
		int result=factN/(factR * factNR);
		System.out.println(result);

	}

}

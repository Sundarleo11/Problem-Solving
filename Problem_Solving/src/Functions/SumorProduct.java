package Functions;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		if(c==1) {
			int sum=0,i=1;
			while(i<=n) {
				sum+=i;
				i++;
			}
		 System.out.println(sum);
		}else if(c==2) {
			int product=1, j=1;
			while(j<=n) {
				product*=j;
				j++;
			}
			 System.out.println(product);
		}else {
			System.out.println(-1);
		}
		

	}

}

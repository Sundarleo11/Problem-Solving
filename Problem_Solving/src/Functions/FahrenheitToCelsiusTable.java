package Functions;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	
	public static void FahrenheitToCelsius(int start,int end,int Dist) {
		       //int i=0;
		         int c;
				int i=start;
				while(i<=end) {
					
					c=(5*(i-32))/9;
					
					System.out.println(i +" "+c);
					i=i+Dist;
				}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given three values - Start Fahrenheit Value (S), 
		 * End Fahrenheit value (E) and Step Size (W), you need to convert 
		 * all Fahrenheit values from Start to End at the gap of W, 
		 * into their corresponding Celsius values and print the table.
		Constraints :
			0 <= S <= 80
			S <= E <=  900
			0 <= W <= 40 
			Sample Input 1:
			start:0 
			condition:100 
			incer: 20
			Sample Output 1:
			0   -17
			20  -6
			40  4
			60  15
			80  26
			100 37
			
			Formula
			C=[(F-32)*5]/9)
			c
			
			Sample Input 2:
20
119
13
Sample Output 2:
20  -6
33  0 
46  7
59  15
72  22
85  29
98  36
111 43
			*/
		
		Scanner sc=new Scanner(System.in);
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		int Dist=sc.nextInt();
		int c;
		FahrenheitToCelsius(start,end,Dist);
		
		
		
		
		

	}

}

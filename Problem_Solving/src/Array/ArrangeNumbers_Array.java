package Array;

import java.util.Scanner;

public class ArrangeNumbers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		/*
		 * for(int i=0;i<n;i++) { arr[i]=n; }
		 */	
		for(int i=0;i<n/2;i++) {
			arr[i]=2*i+1;
			arr[n-1-i]=2*i+2;
		}
	   for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }
		

	}

}

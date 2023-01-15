package Array;

import java.util.Scanner;

public class LarageNumberArray {
	
	
	
	
	public static int [] takingInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}

	public static int large(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=takingInput();
		int max=large(arr);
		System.out.print(max);
		
		
		
		

	}

}

package Array;

import java.util.Scanner;

public class IndexofArray {
	
	public static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	public static int [] takingInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=takingInput();
		printArray(arr);
		
		
		
		

	}

}

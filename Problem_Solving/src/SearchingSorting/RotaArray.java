package SearchingSorting;

import java.util.Scanner;

public class RotaArray {
	
	public static void print(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void RotateArray(int arr[], int d) {
		
		
		int i=0;
		int n=arr.length;
		int arr1[]=new int[n];
		
		for(i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(i=0;i<arr.length -d;i++) {
			arr[i]=arr1[i+d];
			
		}
	   for(int j=i;j<arr.length;j++) {
		   arr[j]=arr1[d-arr.length+j];
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr1[]= {1, 2, 3, 4, 5, 6, 7};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		RotateArray(arr, d);
		print(arr);
		

	}

}

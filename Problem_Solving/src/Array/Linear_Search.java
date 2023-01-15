package Array;

import java.util.Scanner;

public class Linear_Search {
	
	
	public static void Find(int index, int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(index==i) {
				System.out.println(arr[i]);
			}else {
				System.out.println(-1);
				break;
			}
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
		Scanner sc=new Scanner(System.in);
		int arr[]=takingInput();
		int index=sc.nextInt();
		Find(index, arr);
		
	}


}

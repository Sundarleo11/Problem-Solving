package Array;

import java.util.Scanner;

public class Arrays_Sum {
	
	/*
	 * public static int solution(int ary[]) {
	 * 
	 * int sum=0; for(int i=0;i<ary.length;i++) { sum+=ary[i]; } return sum; }
	 * 
	 * 
	 * public static int [] takingInput() { Scanner sc=new Scanner(System.in); int
	 * n=sc.nextInt(); int size=sc.nextInt(); int ary[]=new int[size];
	 * 
	 * for(int i=0;i<n;i++) { ary[i]=sc.nextInt();
	 * 
	 * } for(int j=0;j<ary.length;j++) { ary[j]=sc.nextInt(); }
	 * 
	 * return ary; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[] arr=takingInput(); solution(arr);
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int input[]=new int[n];
		int size=sc.nextInt();
		int size_arry[]=new int[size];
		
		  for(int i=0;i<input.length;i++) { input[i]=sc.nextInt(); }
		 
	    for(int i=0;i<size;i++) {
	    	size_arry[i]=sc.nextInt();
	    }
	    
	    int sum=0;
	    for(int j=0;j<size_arry.length;j++) {
	    	sum+=size_arry[j];
	    }
	    
	    System.out.println(sum);
	}


	
}

package Array2D;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class sampleTwoArray {

	public static int[][] takeInput() {
		// Scanner sc=new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value matrix :" + "row" + i + " cols" + j);
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = takeInput();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

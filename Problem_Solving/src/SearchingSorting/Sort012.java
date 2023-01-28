package SearchingSorting;

import java.util.Scanner;

public class Sort012 {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort012(int arr[]) {

		int n1 = 0, n2 = 0, n3 = 0, i, j;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				n1++;
			if (arr[i] == 1)
				n2++;
			if (arr[i] == 2)

				n3++;
		}

		i = 0;
		j = 0;

		while (j < n1) {
			arr[i] = 0;
			i++;
			j++;

		}
		j = 0;
		while (j < n2) {
			arr[i] = 1;
			i++;
			j++;

		}
		j = 0;

		while (j < n3) {
			arr[i] = 2;
			i++;
			j++;

		}

		// return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		Sort012(arr);
		print(arr);

	}

}

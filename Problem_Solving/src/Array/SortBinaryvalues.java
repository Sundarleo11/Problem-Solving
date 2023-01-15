package Array;

public class SortBinaryvalues {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void Sort(int arr[]) {

		int c = 0, i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				c++;
		}
		for (i = 0; i < c; i++) {
			arr[i] = 0;
		}
		for (;i < arr.length; i++) {
			arr[i] = 1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
		Sort(arr);
		// int n=7;
		// Sort(arr);
		// Sort(arr,n);
		printArray(arr);

	}

}

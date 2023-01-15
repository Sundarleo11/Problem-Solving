package Array;

public class Swap_Alternate {

	public static int[] Pair(int arr[]) {

		for (int i = 0; i < arr.length - 1; i += 2) {
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			// System.out.print(arr[i+1]);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 7, 6, 5,3 };
		Pair(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

package Array;

public class Find_Unique_number {

	public static void FindUnique(int arr[]) {
		int i, j, c;

		for (i = 0; i < arr.length; i++) {
			c = 0;
			for (j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c++;
				}
			}
			if (c == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 3, 1, 6, 1, 6, 9 };
		FindUnique(arr);

	}

}

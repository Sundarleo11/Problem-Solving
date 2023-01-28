package SearchingSorting;

public class MergeArray {

	public static void print(int arr3[]) {

		int n = arr3.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr3[i]+" ");
		}
	}

	public static int[] mergeArry(int arr1[], int arr2[]) {

		int n = arr1.length;
		int m = arr2.length;
		int arr[] = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;

			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 3, 5, 7, 9, 11 };
		int arr2[] = { 2, 4, 6, 8, 10, 12, 14 };

		int arr3[] = mergeArry(arr1, arr2);
		print(arr3);
	}

}

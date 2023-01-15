package Array;

public class Find_Duplicate {
	
	public static void Find_Duplicate(int arr[]) {
		int i, j, c;

		for (i = 0; i < arr.length; i++) {
			//c = 0;
			for (j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
			/*
			 * if (c != 1) { System.out.println(arr[i]);
			 * 
			 * }
			 */
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 3, 3, 1, 6, 1, 6, 9 };
		int arr[]= {0, 7, 2, 3, 4, 7, 9, 3, 9};
		Find_Duplicate(arr);

	}

}

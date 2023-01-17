package Array;

public class ArrayIntersection {
	
	public static void Find_Duplicate(int arr1[],int arr2[]) {
		int i, j, c;

		for (i = 0; i < arr1.length; i++) {
			//c = 0;
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr2[j]=Integer.MIN_VALUE;
					System.out.print(arr1[i]+" ");
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
		//int arr[]= {0, 7, 2, 3, 4, 7, 9, 3, 9};
		int arr2[]= {10};
		int arr1[]= {10,10};
		//int arr2[]= {6,2,3};
		//int arr1[]= {9,6,9,3,4};
		Find_Duplicate(arr1,arr2);

	}

}

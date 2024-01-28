package HashMap;

import java.util.HashMap;

public class PrintIntersection {

	public static void PrintIntersection(int arr1[], int arr2[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// length of first Array map to hashmap
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				int getValue = map.get(arr1[i]);
				map.put(arr1[i], getValue + 1);
			} else {
				map.put(arr1[i], 1);
			}

		}
		// maped the array2 frequency check
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if (freq > 0) {
					System.out.print(arr2[i] + " ");
					map.put(arr2[i], freq - 1);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = new int[] { 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 43 };
		int arr2[] = new int[] { 6, 7, 3, 5, 6, 8, 2, 1 };

		PrintIntersection(arr1, arr2);

	}

}

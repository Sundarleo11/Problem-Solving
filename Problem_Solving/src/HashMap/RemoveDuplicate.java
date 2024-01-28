package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class RemoveDuplicate {

	private static ArrayList<Integer> Duplicate(int arr[]) {

		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
			  continue;
			}
			output.add(arr[i]);
			//map.put(arr[i], true);
			map.put(arr[i], true);
		}

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7 };

		ArrayList<Integer> output = Duplicate(a);
		
		for(int i: output) {
			System.out.print(i+" ");
		}

	}

}

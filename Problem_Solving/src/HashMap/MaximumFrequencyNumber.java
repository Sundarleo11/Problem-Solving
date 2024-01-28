package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaximumFrequencyNumber {

	public static int MaximumFrequencyNumber(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int max = 0;
		int ans = Integer.MIN_VALUE;

		for (int i : arr) {
			if (map.get(i) > max) {
				max = map.get(i);
				ans = i;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
		// List<Integer> anyList=Arrays.asList(2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2,
		// 6);

		int maxCount = MaximumFrequencyNumber(arr);

		System.out.println("MaximumFrequencyNumber :" + maxCount);

	}

}

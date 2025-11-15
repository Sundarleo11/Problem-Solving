import java.util.*;
/*
Wave Array
==========
Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.

How it works
Step 1: Sort

[1, 2, 3, 4, 5]

Step 2: Swap pairs

swap(0,1) → [2, 1, 3, 4, 5]

swap(2,3) → [2, 1, 4, 3, 5]

This satisfies wave pattern:

arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]


*/
class Solution {
    public void sortInWave(int arr[]) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Swap adjacent elements
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int arr[] = {1, 2, 3, 4, 5};

        sol.sortInWave(arr);

        System.out.println("Wave Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

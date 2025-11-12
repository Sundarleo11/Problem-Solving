import java.util.*;
/*
Given an array arr[] of positive integers. Reverse every sub-array group of size k.
Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. 

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than array size, the entire array is reversed.
Constraints:
1 ≤ arr.size(), k ≤ 105
1 ≤ arr[i] ≤ 105


*/
class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k - 1, n - 1);
            reverse(arr, i, end);
        }
    }

    // helper function to reverse part of the array
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /*
    Alter sollution
    public List<Integer> reverseInGroups(List<Integer> list, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += k) {
            int end = Math.min(i + k, list.size());
            List<Integer> sub = list.subList(i, end);
            Collections.reverse(sub);
            result.addAll(sub);
        }
        return result;
    }

    */

    // testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5};
        sol.reverseInGroups(arr1, 3);
        System.out.println(Arrays.toString(arr1)); // [3, 2, 1, 5, 4]

        int[] arr2 = {5, 6, 8, 9};
        sol.reverseInGroups(arr2, 5);
        System.out.println(Arrays.toString(arr2)); // [9, 8, 6, 5]
    }
}

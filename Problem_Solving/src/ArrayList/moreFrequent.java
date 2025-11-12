import java.util.*;
/*
Given an array arr[] and two elements x and y, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one.

Examples:

Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5
Output: 4
Explanation: frequency of 4 is 4.frequency of 5 is 1.Since 4>1 so return 4
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7
Output: 1
Explanation: frequency of 1 is 1.frequency of 7 is 1.Since 1 < 7, return 1.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] , x , y ≤ 108


*/
class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        int countX = 0, countY = 0;

        // Count frequency of x and y
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                countX++;
            } else if (arr.get(i) == y) {
                countY++;
            }
        }

        // Compare counts and return result
        if (countX > countY) return x;
        if (countY > countX) return y;

        // If both have same frequency, return smaller one
        return Math.min(x, y);
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        List<Integer> arr1 = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5);
        int x1 = 4, y1 = 5;
        System.out.println(sol.moreFrequent(arr1, x1, y1)); // Output: 4

        // Example 2
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int x2 = 1, y2 = 7;
        System.out.println(sol.moreFrequent(arr2, x2, y2)); // Output: 1

        // Example 3 (equal frequency)
        List<Integer> arr3 = Arrays.asList(10, 20, 10, 30, 20, 40);
        int x3 = 10, y3 = 20;
        System.out.println(sol.moreFrequent(arr3, x3, y3)); // Output: 10
    }
}

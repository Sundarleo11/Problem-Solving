import java.util.*;  // for ArrayList
/*
Strongest Neighbour
Difficulty: BasicAccuracy: 57.04%Submissions: 54K+Points: 1
You are given an array arr[] consisting of positive integers. Return the maximum of every adjacent pairs in the array.

Examples:

Input: arr[] = [1, 2, 2, 3, 4, 5]
Output: [2, 2, 3, 4, 5]
Explanation: Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2, ... and so on.
Input: arr[] = [5, 5]
Output: [5]
Explanation: We only have two elements so max of 5 and 5 is 5 only.
Constraints:
2 ≤ arr.size ≤ 105
1 ≤ arr[i] ≤ 106


*/
class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> num = new ArrayList<>(n - 1); // preallocate size for efficiency
        
        for (int i = 0; i < n - 1; i++) {
            // using ternary operator instead of Math.max() for slightly better speed
            int maxVal = arr[i] > arr[i + 1] ? arr[i] : arr[i + 1];
            num.add(maxVal);
        }
        
        return num;
    }

    // Optional main() to test locally
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 5, 2, 9, 7};
        System.out.println(s.maxAdj(arr)); // Output: [5, 5, 9, 9]
    }
}

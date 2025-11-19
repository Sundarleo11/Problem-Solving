public class  TrappingRainWater{

    /*
    Trapping Rain Water
Difficulty: HardAccuracy: 33.14%Submissions: 492K+Points: 8Average Time: 20m
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

Examples:

Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.
Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides.
Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
Output: 9
Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.


    */

    // Function to calculate total trapped water
    public static int trap(int[] arr) {
        int n = arr.length;

        int left = 0;               // Start pointer
        int right = n - 1;          // End pointer
        int leftMax = 0;            // Max height on left side
        int rightMax = 0;           // Max height on right side
        int water = 0;              // Total trapped water

        while (left <= right) {

            // If left wall is smaller -> water depends on leftMax
            if (arr[left] <= arr[right]) {

                // If new left wall is highest so far, update leftMax
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    // Else, water can be trapped
                    water += leftMax - arr[left];
                }
                left++;

            } else {
                // Right wall is smaller → water depends on rightMax

                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    // Trap water
                    water += rightMax - arr[right];
                }
                right--;
            }
        }

        return water;
    }

    // Main method to test
    public static void main(String[] args) {

        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        System.out.println("Water trapped = " + trap(arr1));  // Output: 10

        int[] arr2 = {3, 0, 2, 0, 4};
        System.out.println("Water trapped = " + trap(arr2));  // Output: 7

        int[] arr3 = {1, 2, 3, 4};
        System.out.println("Water trapped = " + trap(arr3));  // Output: 0

        int[] arr4 = {2, 1, 5, 3, 1, 0, 4};
        System.out.println("Water trapped = " + trap(arr4));  // Output: 9
    }
}

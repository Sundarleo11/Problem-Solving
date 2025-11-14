// User function Template for Java
/*

Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.

alter sollution for collection

Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
Collections.rotate(Arrays.asList(boxed), -d);

// copy back to arr
for (int i = 0; i < arr.length; i++) {
    arr[i] = boxed[i];
}

*/
class Solution {

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {

        int n = arr.length;
        d = d % n;  // handle d > n

        // three-step reverse
        reverse(arr, 0, d - 1);   // Step 1: reverse first d
        reverse(arr, d, n - 1);   // Step 2: reverse remaining
        reverse(arr, 0, n - 1);   // Step 3: reverse full array
    }

    // helper reverse function
    static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

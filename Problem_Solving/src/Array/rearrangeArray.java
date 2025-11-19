import java.util.*;

class RearrangeAnArray {

/*

Rearrange Array Alternately
Difficulty: MediumAccuracy: 35.15%Submissions: 269K+Points: 4
Given an array of positive integers. Your task is to rearrange the array elements alternatively i.e. first element should be the max value, the second should be the min value, the third should be the second max, the fourth should be the second min, and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [6, 1, 5, 2, 4, 3]
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is: [6, 1, 5, 2, 4, 3]
Input: arr[]= [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
Output: [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
Explanation: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
Input: arr[]= [1]
Output: [1]


*/


    public void rearrange(int arr[]) {

        // Step 1: Sort (required for max-min pattern)
        Arrays.sort(arr);

        int n = arr.length;

        int minIndex = 0;
        int maxIndex = n - 1;

        // Maximum element + 1 (to encode new values)
        int maxElem = arr[n - 1] + 1;

        // Step 2: Encode max and min into array
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                // Even index → put max
                arr[i] = arr[i] + (arr[maxIndex] % maxElem) * maxElem;
                maxIndex--;
            } else {
                // Odd index → put min
                arr[i] = arr[i] + (arr[minIndex] % maxElem) * maxElem;
                minIndex++;
            }
        }

        // Step 3: Decode to final values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Input array
        int[] arr = {890, 289, 483, 519, 550, 447, 946, 957, 92, 783};

        // Create object
        Solution sol = new Solution();

        // Call rearrange
        sol.rearrange(arr);

        // Print result
        System.out.print("Rearranged array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

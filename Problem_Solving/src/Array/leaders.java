import java.util.*;

/*
Array Leaders
Difficulty: EasyAccuracy: 29.94%Submissions: 951K+Points: 2Average Time: 15m
You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

Examples:

Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
Input: arr = [10, 4, 2, 4, 1]
Output: [10, 4, 4, 1]
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
Input: arr = [5, 10, 20, 40]
Output: [40]
Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
Input: arr = [30, 10, 10, 5]
Output: [30, 10, 10, 5]
Explanation: When an array is sorted in non-increasing order, all elements are leaders.

Simple Rule to Remember

Start from right → keep max → if current ≥ max → it is a leader.
*/

class Solution {

    // Function to find leaders in the array
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int maxSoFar = arr[n - 1];   // rightmost element is always a leader
        result.add(maxSoFar);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                result.add(arr[i]);
                maxSoFar = arr[i];
            }
        }

        // Currently leaders are stored in reverse order → reverse them
        Collections.reverse(result);

        return result;
    }

    // MAIN method for testing
    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leadersList = leaders(arr);

        System.out.println("Leaders: " + leadersList);
    }
}

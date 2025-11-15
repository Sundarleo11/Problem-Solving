import java.util.*;
/*
Frequencies in a Limited Array
Difficulty: EasyAccuracy: 27.64%Submissions: 383K+Points: 2Average Time: 10m
You are given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Examples:

Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.


*/
class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;

        // frequency array of size n+1
        int[] freq = new int[n + 1];

        // count frequencies of numbers 1 to n
        for (int x : arr) {
            if (x >= 1 && x <= n) {
                freq[x]++;
            }
        }

        // convert freq array to list
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(freq[i]);
        }

        return result;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 3, 5};

        Solution obj = new Solution();
        List<Integer> ans = obj.frequencyCount(arr);

        System.out.println(ans);
    }
}

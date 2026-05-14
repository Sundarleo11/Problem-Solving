package Bitmagic;

/*
 Power of 2
Basic Accuracy: 50.29% Submissions: 18256 Points: 1
Given a positive integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.


Example 1:

Input: N = 1
Output: true
Explanation: 1 is equal to 2 raised to 0 (20 == 1).
Example 2:

Input: N = 98
Output: false
Explanation:
98 cannot be obtained by any power of 2.

Your Task: Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or false by checking is given number can be represented as a power of two or not.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
 */
public class PowerOf2 {

    private static boolean PowerOf2(int n) {
        return (n * (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int N = 98;

        System.out.println(PowerOf2(N));
    }
}

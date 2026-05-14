package Bitmagic;

/*

4. Count total set bits
Medium Accuracy: 45.48% Submissions: 23942 Points: 4
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:

Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.
Example 2:

Input: N = 17
Output: 35
Explanation: From numbers 1 to 17(both inclusive),
the total number of set bits is 35.

Your Task: The task is to complete the function countSetBits() that takes n as a parameter and returns the count of all bits.
 */
public class CountTotalSetBits {

    private static int CountTotalSetBits(int n) {
        int total = 0;
        for (int i = 1; i <=n; i++) {

            int num = i;
            while (num > 0) {
                total = total + (num & 1);
                num = num >> 1;
            }
        }
        return total;

    }

    public static void main(String[] args) {

        int N = 17;

        System.out.print(CountTotalSetBits(N));
    }
}

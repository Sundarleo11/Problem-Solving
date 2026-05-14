package Bitmagic;

/*

 Rightmost different bit
Easy Accuracy: 56.24% Submissions: 12396 Points: 2
Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.

Example 1:

Input: M = 11, N = 9
Output: 2
Explanation: Binary representation of the given
numbers are: 1011 and 1001,
2nd bit from right is different.
Example 2:

Input: M = 52, N = 4
Output: 5
Explanation: Binary representation of the given
numbers are: 110100â€¬ and 0100,
5th-bit from right is different.
 */
public class RightmostDifferentBit {

    private static int RightmostDifferentBit(int m, int n) {
        int x = m ^ n;

        int pos = 1;
        while ((x & 1) == 0) {
            x = x >> 1;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        int m = 52, n = 4;

        System.out.print(RightmostDifferentBit(m, n));
    }
}

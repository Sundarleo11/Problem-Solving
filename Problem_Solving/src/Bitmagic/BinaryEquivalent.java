package Bitmagic;
/*
 Binary To Gray Code equivalent
Basic Accuracy: 70.46% Submissions: 6910 Points: 1
You are given a decimal number N. You need to find the gray code of the number N and convert it into decimal.
To see how it's done, refer here.

Example 1:

Input: N = 7
Output: 4
Explanation: 7 is represented as 111 in
binary form. The gray code of 111 is 100,
in the binary form whose decimal equivalent
is 4.
Example 2:

Input: N = 10
Output: 15
Explanation: 10 is represented as 1010 in
binary form. The gray code of 1010 is 1111,
in the binary form whose decimal equivalent
is 15.
Example 3:

Input: N = 0
Output: 0
Explanation: Zero is represented as zero
in binary, gray, and decimal.
 */
/*

Gray to Binary equivalent
Basic Accuracy: 69.71% Submissions: 6622 Points: 1
Given N in Gray code equivalent. Find its binary equivalent.
Note: We need to find the binary equivalent of the given gray code and return the decimal equivalent of the binary representation.

Example 1:

Input: N = 4
Output: 7
Explanation:
4 is represented as gray 100 and its
binary equivalent is 111 whose decimal
equivalent is 7.
Example 2:

Input: N = 15
Output: 10
Explanation:
15 is represented as gray 1111 and its
binary equivalent is 1010 i.e. 10 in decimal.
Example 3:

Input: N = 0
Output: 0
Explanation: Zero is zero in gray and in
binary and decimal.
 */

public class BinaryEquivalent {

    private static int BinaryEquivalentGray(int n) {
        return (n ^ (n >> 1));
    }


    private static int GaryEquivalentBinary(int m) {
        int res = m;
        while (m > 0) {
            m = m >> 1;
            res = res ^ m;
        }
        return res;
    }

    public static void main(String[] args) {

        int N = 10, M = 15;
        System.out.println(BinaryEquivalentGray(N));
        System.out.println(GaryEquivalentBinary(M));

    }
}

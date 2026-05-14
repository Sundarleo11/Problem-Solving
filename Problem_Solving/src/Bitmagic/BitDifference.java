package Bitmagic;


/*
You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need
to be flipped are 01010. If we flip
these bits, we get 10100, which is B.
Example 2:

Input: A = 20, B = 25
Output: 3
Explanation:
A  = 10100
B  = 11001
As we can see, the bits of A that need
to be flipped are 10100. If we flip
these bits, we get 11001, which is B.

 */
public class BitDifference {

    private static int BitDifference(int a, int b) {
        int count = 0;

        int x = a ^ b;

        while (x > 0) {
            count = count + (x & 1);

            x = x >> 1;
        }
        return count;

    }

    public static void main(String[] args) {

        int A = 10, B = 20;
        System.out.print(BitDifference(A, B));


    }
}

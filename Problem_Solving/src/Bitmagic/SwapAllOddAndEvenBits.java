package Bitmagic;

/*
Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

Example 1:

Input: N = 23
Output: 43
Explanation:
Binary representation of the given number
is 00010111 after swapping
00101011 = 43 in decimal.
Example 2:

Input: N = 2
Output: 1
Explanation:
Binary representation of the given number
is 10 after swapping 01 = 1 in decimal.

Your Task: Your task is to complete the function swapBits() which takes an integer and returns an integer with all the odd and even bits swapped.
 */
public class SwapAllOddAndEvenBits {

    private static int SwapAllOddAndEvenBits(int n) {

        //Long oddbit = n * 0x5555555555555555L;
        //Long evenbit = n * 0xAAAAAAAAAAAAAAAAL;
        // Extract odd bits
        int oddBits = n & 0x55555555;

        // Extract even bits
        int evenBits = n & 0xAAAAAAAA;

        //odd left shift
        oddBits = oddBits << 1;

        //even right shift
        evenBits = evenBits >> 1;

        return oddBits | evenBits;


    }

    public static void main(String[] args) {
        int N = 2;
        System.out.println(SwapAllOddAndEvenBits(N));

    }
}

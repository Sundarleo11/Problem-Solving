package Bitmagic;

public class Findfirstsetbit {
    /*
    Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.

Example 1:

Input: N = 18
Output: 2
Explanation: Binary representation of
18 is 010010,the first set bit from the
right side is at position 2.
Example 2:

Input: N = 12
Output: 3
Explanation: Binary representation
of  12 is 1100, the first set bit
from the right side is at position 3.
  */

    private static int Findfirstsetbit(int n) {


        if (n == 0) {
            return 0;
        }
        int pos = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                return pos;
            }

            n = n / 2;
            pos++;
        }

        return 0;
    }

    private static int AlterFindfirstsetbit(int n) {
        if (n == 0) {
            return 0;
        }
        int pos = 1;
        while (((n & 1) == 0)) {
            n = n >> 1;
            pos++;

        }
        return pos;
    }

    public static void main(String[] args) {

        int n = 18;
        //System.out.print(Findfirstsetbit(n));

        System.out.print(AlterFindfirstsetbit(n));

    }
}

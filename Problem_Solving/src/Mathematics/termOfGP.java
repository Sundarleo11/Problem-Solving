package Mathematics;

/*
Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Example 1:

Input:
A = 2
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
 */
public class termOfGP {

    private static double termOfGP(int a, int b, int c) {


        int r = (b / a);

        return a * Math.pow(r, c - 1);
    }

    public static void main(String[] args) {
        System.out.print(termOfGP(1, 2, 2));
    }
}

package Mathematics;

/*
A prime number is a number which is only divisible by 1 and itself.
Given number N check if it is prime or not.



Example 1:

Input:
N = 5
Output: Yes
Explanation: 5 is only divisible by 1
and itself. So, 5 is a prime number.
 */

/*
 Exactly 3 Divisors
Easy Accuracy: 44.86% Submissions: 50325 Points: 2
Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.



Example 1:

Input:
N = 6
Output: 1
Explanation: The only number with
3 divisor is 4.


Example 2:

Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.
 */

public class PrimalityTest {

    // Function to count numbers with exactly 3 divisors
    private static int exactly3Divisors(int N) {

        int count = 0;

        for (int i = 2; i * i <= N; i++) {

            if (primeNumber(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean primeNumber(int n) {
        if (n == 2 || n == 3) {
            return true;
        }

        // eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = 6 + i) {
            if (n % i == 0 || n * (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        //System.out.print(primeNumber(n));

        System.out.println(exactly3Divisors(n));
    }
}

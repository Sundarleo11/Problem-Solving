package Mathematics;

/*
Input:
N = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24
 */
public class FactorialOfNumber {

    private static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int rec_factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * rec_factorial(n - 1);
    }


    public static void main(String[] args) {
        int n = 4;

        // System.out.print(factorial(n));

        System.out.print(rec_factorial(n));


    }
}

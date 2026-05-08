package Mathematics;

/*

Addition Under Modulo
Basic Accuracy: 56.29% Submissions: 23512 Points: 1
Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.



Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation:
9223372036854775807 + 9223372036854775807
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006



 */

/*

 2.Multiplication Under Modulo
Basic Accuracy: 72.34% Submissions: 7602 Points: 1
You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).

Example 1:

Input:
a = 92233720368547758
b = 92233720368547758
Output: 484266119
Explanation: Multiplication of a and b
under modulo M will be 484266119.
Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: Multiplication of a and b
under modulo M is 0.
 */

public class Modular {

    //long ans = ((a % MOD) * (b % MOD)) % MOD;
    private static long additional(long a, long b) {
        long mod = 1000000007;

        return ((a % mod) + (b % mod)) % mod;
    }

    private static long multiply(long a, long b) {
        long mod = 1000000007;

        return ((a % mod) * (b % mod)) % mod;
    }


    public static void main(String[] args) {


        long a = 9223372036854775807L;
        long b = 9223372036854775807L;
        System.out.println("add " + additional(a, b));
        System.out.println("multiply " + multiply(a, b));
    }
}

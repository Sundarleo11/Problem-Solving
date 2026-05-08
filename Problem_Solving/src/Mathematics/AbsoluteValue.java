package Mathematics;

public class AbsoluteValue {

    /*Input:
    I = -32
    Output: 32
    Explanation:
    The absolute value of -32 is 32.*/

    private static int absolute(int n) {
        if (n < 0) {
            return -1 * n;
        }
        return n;

    }


    public static void main(String[] args) {
        int n = -32;
        System.out.print(absolute(n));
    }
}

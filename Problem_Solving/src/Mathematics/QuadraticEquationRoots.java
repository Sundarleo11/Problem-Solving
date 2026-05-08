package Mathematics;

/*
Given a quadratic equation in the form ax2 + bx + c. Find its roots.

Example 1:

Input:
a = 1
b = -2
c = 1
Output: 1 1
Explanation:
Roots of equation x2-2x+1 are 1 and 1.
D=-b+squrt(b2-4ac);
 */

import java.util.ArrayList;

public class QuadraticEquationRoots {

    private static ArrayList<Integer> QuadraticEquation(int a, int b, int c) {

        ArrayList<Integer> res = new ArrayList<>();

        double square = Math.sqrt((-b * -b) - 4 * a * c);

        if (square < 0.0) {
            System.out.print("imgaration number");
            res.add(-1);

        }
        int r1 = (int) Math.floor(-b + square) / 2 * a;
        int r2 = (int) Math.floor(-b - square) / 2 * a;

        res.add(r1);
        res.add(r2);

        return res;

    }

    public static void main(String[] args) {
        System.out.println(QuadraticEquation(1, -7, 12));
    }
}

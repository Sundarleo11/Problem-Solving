package Mathematics;

/*
Input:
C = 32
Output: 89
Explanation: Using the conversion
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.
 */

public class ConvertCelsiusToFahrenheit {

    private static double Fahrenheit(int n) {

        return (n * 1.8) + 32;
    }

    public static void main(String[] args) {
        int n = 32;
        System.out.print(Fahrenheit(n));
    }
}

import java.util.*;

class Solution {

    public int mean(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    public int median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        // odd
        if (n % 2 != 0) {
            return arr[n / 2];
        }

        // even
        int mid1 = arr[n / 2];
        int mid2 = arr[(n / 2) - 1];
        return (mid1 + mid2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int mean = obj.mean(arr);
        int median = obj.median(arr);

        System.out.println(mean + " " + median);
    }
}

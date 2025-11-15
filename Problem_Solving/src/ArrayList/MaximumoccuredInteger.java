import java.util.*;

class Solution {


    /*
    You are given two integer arrays L[] and R[], where each L[i] and R[i] define the start and end of a range respectively. The goal is to find the integer that appears in the most number of these ranges. If multiple integers occur in the same maximum number of ranges, then return the smallest integer among them. 

    Examples :

   Input: L[] = [1, 4, 3, 1], R[] = [15, 8, 5, 4]
Output: 4
Explanation: The given ranges are [1, 15] [4, 8] [3, 5] [1, 4]. The smallest number that is most common or appears most times in the ranges is 4.
Input: L[] = [1, 5, 9, 13, 21], R[] = [15, 8, 12, 20, 30]
Output: 5
Explanation: The given ranges are [1, 15] [5, 8] [9, 12] [13, 20] [21, 30]. The smallest number that is most common or appears most times in the ranges is 5.



    */

    public int maxOccured(List<Integer> L, List<Integer> R) {
        
        int n = L.size();
        
        // Step 1: Find maximum value from R
        int maxvalue = 0;
        for (int x : R) {
            if (x > maxvalue) {
                maxvalue = x;
            }
        }
        
        // Step 2: Difference array
        int[] freq = new int[maxvalue + 2];
        
        for (int i = 0; i < n; i++) {
            freq[L.get(i)]++;      // start range
            freq[R.get(i) + 1]--;  // end range + 1
        }
        
        // Step 3: Prefix sum to compute counts
        int maxCount = freq[0];
        int index = 0;
        
        for (int i = 1; i <= maxvalue; i++) {
            freq[i] += freq[i - 1];
            
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                index = i;
            }
        }
        
        return index;
    }
    

    // ---------------------------
    //       MAIN METHOD
    // ---------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();

        // Read L array
        for (int i = 0; i < n; i++) {
            L.add(sc.nextInt());
        }

        // Read R array
        for (int i = 0; i < n; i++) {
            R.add(sc.nextInt());
        }

        Solution obj = new Solution();
        
        int result = obj.maxOccured(L, R);
        System.out.println(result);
        
        sc.close();
    }
}

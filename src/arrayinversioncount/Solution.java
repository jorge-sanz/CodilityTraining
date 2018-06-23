package arrayinversioncount;

public class Solution {

    /**
     * Solution:
     * Check if an inversion exists for each possible pair of indexes. Complexity: O(N^2).
     * <p>
     * Non-tested possible improvement:
     * Apply a sorting algorithm that identifies inversions and introduce the counter there, getting the required
     * time complexity: O(N*log(N)).
     */
    public int solution(int[] A) {
        int length = A.length;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (A[i] > A[j]) counter++;
            }
        }

        return counter;
    }
}

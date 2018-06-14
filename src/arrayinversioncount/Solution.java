package arrayinversioncount;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
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

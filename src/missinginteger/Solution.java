package missinginteger;

public class Solution {
    public int solution(int[] A) {
        int number = 0;
        boolean foundIt = true;
        boolean occurs;

        while (foundIt) {
            occurs = false;
            number++;

            for (int i = 0; i < A.length; i++) {
                if (number == A[i]) {
                    occurs = true;
                    break;
                }
            }

            if (!occurs) foundIt = false;
        }

        return number;
    }
}

package oddoccurrencesinarray;

public class Solution {

    public static int solution(int[] A) {
        int result = 0;
        int sum;

        for (int i = 0; i < A.length; i++) {
            sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) sum++;
            }

            if (sum % 2 != 0) return A[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}

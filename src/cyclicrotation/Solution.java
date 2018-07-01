package cyclicrotation;

import java.util.ArrayList;

public class Solution {
    public static int[] solution(int[] A, int K) {
        ArrayList<Integer> previousArray = new ArrayList<Integer>();
        ArrayList<Integer> currentArray;

        if (A.length == 0) return A;

        for (int i = 0; i < A.length; i++) {
            previousArray.add(new Integer(A[i]));
        }

        currentArray = new ArrayList<>(previousArray);

        for (int i = 0; i < K; i++) {
            for (int j = 1; j < previousArray.size(); j++) {
                currentArray.set(j, previousArray.get(j - 1));
            }

            currentArray.set(0, previousArray.get(previousArray.size() - 1));
            previousArray = new ArrayList<>(currentArray);
        }

        int[] solution = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            solution[i] = currentArray.get(i);
        }

        return solution;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3, 6}, 2);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("Solution " + solution[i]);
        }
    }
}

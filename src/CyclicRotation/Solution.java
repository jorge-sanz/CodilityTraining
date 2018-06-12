package CyclicRotation;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        ArrayList<Integer> previousArray = new ArrayList<Integer>();
        ArrayList<Integer> currentArray;

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
        int[] solution = solution(new int[]{1, 2 , 3, 6}, 2);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("Solution " + solution[i]);
        }
    }
}

package strsymmetrypoint;

public class Solution {

    public static int solution(String S) {
        // write your code in Java SE 8
        int length = S.length();

        if (length == 0) return -1;
        if (length == 1) return 0;
        if (length % 2 == 0) return -1;

        for (int i = 0; i < ((length - 1) / 2); i++) {
            if (S.charAt(i) != S.charAt(length - 1 - i)) return -1;
        }

        return (length - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Solution: " + solution("racecar"));
        System.out.println("Solution: " + solution(""));
        System.out.println("Solution: " + solution("x"));
        System.out.println("Solution: " + solution("xx"));
    }
}

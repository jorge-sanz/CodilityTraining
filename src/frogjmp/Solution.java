package frogjmp;

public class Solution {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double start = X;
        double end = Y;
        double jumpDistance = D;

        return (int) Math.ceil((end - start) / jumpDistance);
    }

    public static void main(String[] args) {
        System.out.println("Solution: " + solution(10, 85, 30));
        System.out.println("Solution: " + solution(10, 10, 30));
    }
}

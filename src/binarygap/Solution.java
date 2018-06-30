package binarygap;

public class Solution {

    public static int solution(int N) {
        int temporaryLength = 0;
        int finalLength = 0;
        String binary = Integer.toBinaryString(N);
        Status status = Status.SEARCHING;
        char character;

        for (int i = 0; i < binary.length(); i++) {
            character = binary.charAt(i);

            if (status == Status.SEARCHING && character == '0') {
                temporaryLength++;
                status = Status.COUNTING;
            } else if (status == Status.COUNTING && character == '0') {
                temporaryLength++;
            } else if (status == Status.COUNTING && character == '1') {
                if (finalLength < temporaryLength) finalLength = temporaryLength;
                status = Status.SEARCHING;
                temporaryLength = 0;
            }
        }

        return finalLength;
    }

    enum Status {
        SEARCHING, COUNTING
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

}

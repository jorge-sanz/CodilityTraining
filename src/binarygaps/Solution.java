package binarygaps;

public class Solution {

    public static int solution(int N) {
        // write your code in Java SE 8
        int temporaryLength = 0;
        int finalLength = 0;
        String binary = Integer.toBinaryString(N);
        String status = "searching";

        char character;

        for (int i = 0; i < binary.length(); i++) {
            character = binary.charAt(i);

            if (status.equals("searching") && character == '0') {
                temporaryLength++;
                status = "counting";
            } else if (status.equals("counting") && character == '0') {
                temporaryLength++;
            } else if (status.equals("counting") && character == '1') {
                if (finalLength < temporaryLength) finalLength = temporaryLength;
                status = "searching";
                temporaryLength = 0;
            }
        }

        return finalLength;
    }

    public static String intToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {

        // Prints "Hello, World" to the terminal window.
        System.out.println(solution(1041));

    }

}

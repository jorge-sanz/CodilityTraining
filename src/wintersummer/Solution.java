package wintersummer;

/**
 * Summary of algorithm: the last day of winter can be the first day of year, but if there is a day with a temperature
 * lower than that day, then you need to find a day with higher temperature than the maximum temperature found
 * previously to break winter and start summer, and so on.
 */

public class Solution {
    public static int solution(int[] T) {
        int length = T.length;
        int lastDayOfWinter = 0;
        int maximumTemperatureOfWinter = T[0];
        int maximumTemperatureFound = T[0];
        boolean lookingForTheSummer = false;

        for (int i = 1; i < length; i++) {

            /**
             * If we found a day with higher temperature than our maximum temperature until now, then we update the
             * value.
             */
            if (maximumTemperatureFound < T[i]) {
                maximumTemperatureFound = T[i];
            }

            /**
             * We break the possible summer.
             */
            if (maximumTemperatureOfWinter >= T[i]) {
                maximumTemperatureOfWinter = maximumTemperatureFound;
                lookingForTheSummer = true;
                System.out.println("Breaking summer");
            }

            /**
             * Check if we are probably breaking the winter to switch to possible summer.
             */
            if (lookingForTheSummer && T[i + 1] > maximumTemperatureOfWinter) {
                lastDayOfWinter = i;
                lookingForTheSummer = false;
            }
        }

        return lastDayOfWinter + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{1, 0, 3}));
        System.out.println(solution(new int[]{1, 3, 2, 4}));
        System.out.println(solution(new int[]{1, 3, 2, 0, 4, 5}));
    }
}

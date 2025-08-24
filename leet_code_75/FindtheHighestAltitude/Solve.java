package leet_code_75.FindtheHighestAltitude;

public class Solve {

    public static int largestAltitude(int[] gain) {

        // int[] altitude = new int[gain.length + 1];
        // altitude[0] = 0;
        // int largestAltitude = 0;

        // for (int i = 0; i < gain.length; i++) {

        // altitude[i + 1] = gain[i] + altitude[i];

        // if (altitude[i + 1] > largestAltitude) {
        // largestAltitude = altitude[i + 1];
        // }

        // }

        // return largestAltitude;

        int currentAltitude = 0;
        int largestAltitude = 0;

        for (int n : gain) {
            currentAltitude += n;

            if (currentAltitude > largestAltitude) {
                largestAltitude = currentAltitude;
            }

        }

        return largestAltitude;

    }

    public static void main(String[] args) {

        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(largestAltitude(gain));

    }

}

package leet_code_75.array_string.CanPlaceFlowers;

public class Solve {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;

        for (int i = 0; i < length && n > 0; i++) {

            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == length - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }

        }

        return n <= 0;

    }

    public static void main(String[] args) {

        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));

    }

}

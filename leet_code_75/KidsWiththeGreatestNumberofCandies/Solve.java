package leet_code_75.KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class Solve {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();

        int maxCandies = 0;

        for (int i : candies) {
            if (i > maxCandies) {
                maxCandies = i;
            }
        }

        System.out.println(maxCandies);

        for (int i = 0; i < candies.length; i++) {

            res.add(candies[i] + extraCandies >= maxCandies);

        }

        return res;

    }

    public static void main(String[] args) {

        int[] candies = { 4, 2, 1, 3, 1 };
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }

}

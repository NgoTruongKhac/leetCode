package leet_code_75.hashmap_set.EqualRowandColumnPairs;

import java.util.HashMap;
import java.util.Map;

public class Solve {

    public static int equalPairs(int[][] grid) {

        int n = grid.length;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            StringBuilder rowBuider = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowBuider.append((char) grid[i][j] + '0');
            }

            String row = rowBuider.toString();

            map.put(row, map.getOrDefault(row, 0) + 1);

        }

        int count = 0;

        for (int j = 0; j < n; j++) {

            StringBuilder coBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {

                coBuilder.append((char) grid[i][j] + '0');

            }
            String col = coBuilder.toString();

            if (map.containsKey(col)) {
                count += map.get(col);
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[][] gird = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };

        System.out.println(equalPairs(gird));
    }

}

package leet_code_75.hashmap_set.DetermineifTwoStringsAreClose;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solve {
    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        int[] freq1 = map1.values().stream().mapToInt(i -> i).toArray();
        int[] freq2 = map2.values().stream().mapToInt(i -> i).toArray();

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);

        // if (word1.length() != word2.length()) {
        // return false;
        // }

        // // Arrays to store frequency counts of characters
        // int[] freq1 = new int[26];
        // int[] freq2 = new int[26];

        // // Populate frequency arrays
        // for (char c : word1.toCharArray()) {
        // freq1[c - 'a']++;
        // }
        // for (char c : word2.toCharArray()) {
        // freq2[c - 'a']++;
        // }

        // // Condition 2: Check if the set of characters is the same
        // for (int i = 0; i < 26; i++) {
        // if ((freq1[i] > 0 && freq2[i] == 0) || (freq1[i] == 0 && freq2[i] > 0)) {
        // return false;
        // }
        // }

        // // Condition 3: Check if the sorted frequency arrays are equal
        // Arrays.sort(freq1);
        // Arrays.sort(freq2);

        // return Arrays.equals(freq1, freq2);

    }

    public static void main(String[] args) {
        String s1 = "cabbba";
        String s2 = "abbccc";

        System.out.println(closeStrings(s1, s2));

    }
}

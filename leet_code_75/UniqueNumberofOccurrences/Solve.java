package leet_code_75.UniqueNumberofOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solve {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {

            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int n : map.values()) {

            set.add(n);
        }

        if (set.size() != map.size()) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 1, 1, 3 };
        int[] arr2 = { 1, 2, 3 };

        System.out.println(uniqueOccurrences(arr));
        System.out.println(uniqueOccurrences(arr2));

    }

}

package leet_code_75.two_pointers.MaxNumberofKSumPairs;

import java.util.Arrays;

public class Solve {
    public int maxOperations(int[] nums, int k) {

        // Map<Integer, Integer> map = new HashMap<>();

        // int count = 0;
        // for (int n : nums) {

        // int x = k - n;

        // if (map.getOrDefault(x, 0) > 0) {
        // count++;
        // map.put(x, map.get(x) - 1);
        // } else {
        // map.put(n, map.getOrDefault(n, 0) + 1);
        // }

        // }

        // return count++;

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1, count = 0;
        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();
        int[] nums = { 1, 2, 3, 4 };
        int k = 5;

        System.out.println(solve.maxOperations(nums, k));
    }
}

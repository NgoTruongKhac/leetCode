package leet_code_75.MaxConsecutiveOnesIII;

public class Solve {

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }

        return maxLen;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;

        System.out.println(solve.longestOnes(nums, k));
    }

}

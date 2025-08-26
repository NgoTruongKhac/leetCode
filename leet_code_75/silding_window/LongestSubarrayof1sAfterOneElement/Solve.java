package leet_code_75.silding_window.LongestSubarrayof1sAfterOneElement;

public class Solve {

    public int longestSubarray(int[] nums) {

        int left = 0;
        int maxLen = 0;
        int delete = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                delete++;

            }

            while (delete > 1) {

                if (nums[left] == 0) {
                    delete--;
                }

                left++;

            }

            maxLen = Math.max(maxLen, right - left);

        }

        return maxLen;

    }

    public static void main(String[] args) {

        Solve solve = new Solve();
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int[] nums2 = { 1, 1, 0, 1 };

        System.out.println(solve.longestSubarray(nums2));
        System.out.println(solve.longestSubarray(nums));
    }

}

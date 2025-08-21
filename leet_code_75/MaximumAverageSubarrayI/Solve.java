package leet_code_75.MaximumAverageSubarrayI;

public class Solve {

    public double findMaxAverage(int[] nums, int k) {

        int windowsSum = 0;
        for (int i = 0; i < k; i++) {
            windowsSum += nums[i];
        }

        int maxSum = windowsSum;

        for (int i = k; i < nums.length; i++) {

            windowsSum += nums[i] - nums[i - k];

            maxSum = Math.max(maxSum, windowsSum);

        }

        return (double) maxSum / k;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        System.out.println(solve.findMaxAverage(nums, k));
    }

}

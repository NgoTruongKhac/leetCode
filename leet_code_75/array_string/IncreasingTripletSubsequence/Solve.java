package leet_code_75.array_string.IncreasingTripletSubsequence;

public class Solve {

    public boolean increasingTriplet(int[] nums) {

        int length = nums.length;

        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (nums[i] < firstNumber) {
                firstNumber = nums[i];
            } else if (nums[i] <= secondNumber) {
                secondNumber = nums[i];

            } else {

                return true;

            }

        }
        return false;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        int[] nums = { 2, 1, 5, 0, 4, 6 };

        System.out.println(solve.increasingTriplet(nums));

    }

}
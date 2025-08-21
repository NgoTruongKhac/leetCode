package leet_code_75.MoveZeroes;

import java.util.Arrays;

public class Solve {

    public void moveZeroes(int[] nums) {

        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }

        }
        while (count < n) {
            nums[count] = 0;
            count++;
        }

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        int[] nums = { 0, 1, 0, 3, 12 };
        solve.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

    }
}

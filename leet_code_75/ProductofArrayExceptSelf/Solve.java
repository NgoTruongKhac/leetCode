package leet_code_75.ProductofArrayExceptSelf;

public class Solve {

    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int[] res = new int[length];

        int prefix = 1;

        for (int i = 0; i < length; i++) {

            res[i] = prefix;
            prefix *= nums[i];

        }

        int suffix = 1;
        for (int i = length - 1; i >= 0; i--) {

            res[i] *= suffix;
            suffix *= nums[i];

        }
        return res;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        int[] nums = { 1, 2, 3, 4 };

        for (int n : solve.productExceptSelf(nums)) {
            System.out.println(n);
        }

    }

}
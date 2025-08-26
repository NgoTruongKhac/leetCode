package leet_code_75.two_pointers.ContainerWithMostWater;

public class Solve {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;

            int minHeight = height[left];

            if (height[left] > height[right]) {
                minHeight = height[right];
            }

            int area = minHeight * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {

        Solve solve = new Solve();
        int[] heigth = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(solve.maxArea(heigth));
    }

}
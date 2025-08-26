package leet_code_75.stack.AsteroidCollision;

import java.util.Arrays;
import java.util.Stack;

public class Solve {
    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int n : asteroids) {
            boolean alive = true;

            while (!stack.isEmpty() && n < 0 && stack.peek() > 0) {

                if (stack.peek() < -n) {

                    stack.pop();
                    continue;

                } else if (stack.peek() == -n) {
                    stack.pop();

                }

                alive = false;
                break;

            }

            if (alive) {
                stack.push(n);
            }

        }

        int[] res = new int[stack.size()];
        int index = 0;
        for (int n : stack) {
            res[index++] = n;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };

        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}

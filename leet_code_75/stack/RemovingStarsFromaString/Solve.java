package leet_code_75.stack.RemovingStarsFromaString;

public class Solve {

    public static String removeStars(String s) {

        // Stack<Character> stack = new Stack<>();
        // StringBuilder res = new StringBuilder();

        // for (char c : s.toCharArray()) {

        // if (c == '*') {
        // stack.pop();
        // } else {
        // stack.add(c);
        // }

        // }

        // for (char c : stack) {
        // res.append(c);
        // }

        // return res.toString();

        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(c);
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        String s2 = "erase*****";

        System.out.println(removeStars(s));
        System.out.println(removeStars(s2));
    }
}

package leet_code_75.stack.DecodeString;

import java.util.Stack;

public class Solve {

    public static String decodeString(String s) {

        StringBuilder res = new StringBuilder();

        Stack<Integer> counStack = new Stack<>();
        Stack<StringBuilder> currenBuilders = new Stack<>();
        int k = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {

                k = k * 10 + (c - '0');
            } else if (c == '[') {
                counStack.push(k);
                currenBuilders.push(res);
                // reset
                k = 0;
                res = new StringBuilder();

            } else if (c == ']') {

                int count = counStack.pop();
                StringBuilder decode = currenBuilders.pop();

                for (int i = 0; i < count; i++) {

                    decode.append(res);

                }
                res = decode;

            } else {

                res.append(c);
            }

        }

        return res.toString();

    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        System.out.println(decodeString(s));
    }

}

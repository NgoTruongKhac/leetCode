package leet_code_75.array_string.ReverseWordsinaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solve {

    public String reverseWords(String s) {

        s.trim();

        StringTokenizer word = new StringTokenizer(s);

        List<String> res = new ArrayList<>();

        while (word.hasMoreTokens()) {

            res.add(word.nextToken());

        }

        Collections.reverse(res);

        return String.join(" ", res);

        // s.trim();
        // String[] words = s.split("\\s+");

        // StringBuilder res = new StringBuilder();

        // for (int i = words.length - 1; i >= 0; i--) {

        // res.append(words[i]);
        // if (i > 0) {
        // res.append(" ");
        // }

        // }

        // return res.toString();
    }

    public static void main(String[] args) {

        String s = "a good   example";
        Solve solve = new Solve();

        System.out.println(solve.reverseWords(s));

    }

}

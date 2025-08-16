package leet_code_75.merge_string_alternately;

public class Solve {

    public static String mergeStringAlternately(String word1, String word2) {

        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {

            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));

        }
        if (i < word1.length()) {
            res.append(word1.substring(i));
        }
        if (j < word2.length()) {
            res.append(word2.substring(j));
        }

        return res.toString();

    }

    public static void main(String[] args) {

        String word1 = "k h a c";
        String word2 = "baby";

        mergeStringAlternately(word1, word2);

        System.out.println(mergeStringAlternately(word1, word2));
    }

}
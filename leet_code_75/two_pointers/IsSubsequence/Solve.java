package leet_code_75.two_pointers.IsSubsequence;

public class Solve {

    public boolean isSubsequence(String s, String t) {

        // if (s.length() > t.length()) {
        // return false;
        // }

        // if (s.length() == 0) {
        // return true;
        // }

        // int indexofS = 0;

        // for (int i = 0; i < t.length(); i++) {

        // if (s.charAt(indexofS) == t.charAt(i)) {
        // indexofS++;
        // }
        // if (indexofS == s.length()) {
        // return true;
        // }

        // }

        // return false;

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;

        }

        return s.length() == i;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        String s = "abc";
        String t = "ahcgdb";

        System.out.println(solve.isSubsequence(s, t));

    }
}

package leet_code_75.array_string.GreatestCommonDivisorofStrings;

public class Solve {

    private static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, a % b);
    }

    public static String solve(String s1, String s2) {

        if (!(s1 + s2).equals(s2 + s1)) {

            return "";

        }

        int gcdLength = gcd(s1.length(), s2.length());

        return s1.substring(0, gcdLength);

    }

    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";

        System.out.println(solve(s1, s2));
    }

}

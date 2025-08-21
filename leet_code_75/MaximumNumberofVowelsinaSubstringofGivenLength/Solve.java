package leet_code_75.MaximumNumberofVowelsinaSubstringofGivenLength;

public class Solve {

    public boolean isVowel(char c) {

        return "aeiou".indexOf(c) != -1;
    }

    public int maxVowels(String s, int k) {

        int count = 0;
        int maxVowels = 0;

        for (int i = 0; i < k && i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }

        }
        maxVowels = count;

        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            maxVowels = Math.max(maxVowels, count);

            if (maxVowels == k)
                return k;

        }

        return maxVowels;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();
        String s = "abciiidef";
        int k = 3;

        System.out.println(solve.maxVowels(s, k));
    }

}

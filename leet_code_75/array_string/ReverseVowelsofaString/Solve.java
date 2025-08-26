package leet_code_75.array_string.ReverseVowelsofaString;

// import java.util.ArrayList;
// import java.util.List;

public class Solve {

    // private static boolean isVowel(char c) {
    // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c
    // == 'E' || c == 'I' || c == 'O'
    // || c == 'U') {
    // return true;
    // }
    // return false;
    // }

    // public static String reverseVowels(String s) {

    // StringBuilder res = new StringBuilder();

    // List<Character> vowels = new ArrayList<>();
    // for (int i = 0; i < s.length(); i++) {

    // if (isVowel(s.charAt(i))) {
    // vowels.add(s.charAt(i));
    // }

    // }

    // int j = vowels.size() - 1;

    // for (int i = 0; i < s.length(); i++) {
    // if (isVowel(s.charAt(i))) {
    // res.append(vowels.get(j));
    // j--;
    // } else {
    // res.append(s.charAt(i));
    // }

    // }

    // return res.toString();

    private static boolean isVowel(char c) {
        return "aieuoAIEUO".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {

                right--;

            }
            if (left < right) {
                char tempt = chars[left];
                chars[left] = chars[right];
                chars[right] = tempt;

                left++;
                right--;
            }
        }

        return new String(chars);

    }

    public static void main(String[] args) {

        String s = "IceCreAm";

        System.out.println(reverseVowels(s));

    }

}
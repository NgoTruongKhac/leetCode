package leet_code_75.array_string.StringCompression;

public class Solve {

    public int compress(char[] chars) {

        int write = 0;
        int read = 0;
        int n = chars.length;

        while (read < n) {

            char current = chars[read];
            int groudEnd = read;

            while (groudEnd < n && chars[groudEnd] == current) {
                groudEnd++;
            }
            int count = groudEnd - read;

            chars[write++] = current;

            if (count > 1) {
                String countString = String.valueOf(count);

                for (char c : countString.toCharArray()) {

                    chars[write++] = c;

                }
            }

            read = groudEnd;

        }

        return write;

    }

    public static void main(String[] args) {
        Solve solve = new Solve();

        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        System.out.println(solve.compress(chars));
    }

}

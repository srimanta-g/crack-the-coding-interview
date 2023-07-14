
import java.util.*;


class QuestionSix {

    public static void main(String args[]) {
        System.out.println(compress("aaabbbbcccddd"));
    }

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder(precompute(s));

        int i = 0;
        int count = 0;

        while(i < s.length()) {
            count++;

            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }

            sb.append(s.charAt(i));
            sb.append(count);

            count = 0;

            i++;
        }

        return sb.toString();
    }

    private static int precompute(String s) {
        int count = 0;
        int compressedValue = 0;

        int i = 0;

        while(i < s.length()) {
            count++;

            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }

            compressedValue += 1 + String.valueOf(count).length();

            count = 0;

            i++;
        }

        return compressedValue;
    }
}
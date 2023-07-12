import java.util.*;

class QuestionOne {
    public static void main(String args[]) {
        System.out.println(isUniqueUsingDS("Srimant"));
        System.out.println(isUniqueWithoutDS("Srimant"));
    }

    // Time complexity - O(N)
    // Space complexity - O(N)
    public static boolean isUniqueUsingDS(String s) {
        Set<Character> set = new HashSet();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(set.contains(c)) return false;

            set.add(c);
        }

        return true;
    }

    // Time complexity - O(N lon N)
    // Space complexity - O(1)
    public static boolean isUniqueWithoutDS(String s) {
        String sortedString = sortString(s);
        for(int i=0;i<sortedString.length() - 1;i++) {
            if(sortedString.charAt(i) == sortedString.charAt(i+1)) return false;
        }

        return true;
    }

    private static String sortString(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
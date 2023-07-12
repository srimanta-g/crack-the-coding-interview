import java.util.*;

class QuestionTwo {
    public static void main(String args[]) {
        System.out.println(permutationFirstApproach("cat", "taac"));
        System.out.println(permutationSecondApproach("ddddccccbbbbaaaae", "abcdabcdabcedabcd"));
    }


    // Time complexity O(N)
    // Space complexity O(N)
    public static boolean permutationFirstApproach(String a, String b) {
        int[] countArray = new int[256];

        for(int i=0;i<a.length();i++) {
            countArray[(int)(a.charAt(i))]++;
        }

        for(int i=0;i<b.length();i++) {
            countArray[(int)(b.charAt(i))]--;
        }

        for(int x : countArray) {
            if(x < 0 || x > 0) return false;
        }

        return true;
    }

    // Time complexity O(N long N)
    // Space coomplexity O(1)
    public static boolean permutationSecondApproach(String a, String b) {
        a = sortString(a);
        b = sortString(b);

        if(a.length() != b.length()) return false;

        for(int i=0;i<a.length();i++) {
            if(a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }

    public static String sortString(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
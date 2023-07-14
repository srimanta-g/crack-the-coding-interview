import java.util.*;

class QuestionFive {
    public static void main(String args[]) {

        String[][] strArr = {
            {"pale", "ple"},
            {"pales", "pale"},
            {"pale", "bale"},
            {"pale", "bake"},
            {"paleee", "p"},
            {"bake", "cake"}
        };

        for(String[] singleCase : strArr) {
            System.out.println(singleCase[0] + " " + singleCase[1] + " : " + OneWaySecond(singleCase[0], singleCase[1]));
        }
    }

    public static boolean OneWay(String s , String t) {
        int[] countArray = new int[256];

        for(char c : s.toCharArray()) {
            countArray[(int)c]++;
        }

        for(char c : t.toCharArray()) {
            countArray[(int)c]--;
        }


        int count = 0;

        for(int i : countArray) {
            count += i;

            if(count > 2 || count < -1) return false;
        }

        return true;
    }

    public static boolean OneWaySecond(String s, String t) {
        if(s.length() == t.length()) {
            return onReplace(s, t);
        } else if(s.length() + 1 == t.length()) {
            return oneAddOrRemove(s, t);
        } else if(s.length() == t.length() + 1) {
            return oneAddOrRemove(t, s);
        } else if (Math.abs(s.length() + t.length()) > 1) return false;
        return true;
    }

    private static boolean onReplace(String s, String t) {
        boolean alreadyDifferenceFound = false;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != t.charAt(i)) {
                if(alreadyDifferenceFound) return false;
            }

            alreadyDifferenceFound = true;
        }

        return true;
    }

    private static boolean oneAddOrRemove(String a, String b) {
        int index1 = 0;
        int index2 = 0;

        while(index1 < a.length() && index2 < b.length()) {
            if(a.charAt(index1) != b.charAt(index2)) {
                if(index1 != index2) return false;

                index2++; 
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }


}
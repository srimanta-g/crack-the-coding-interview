class QuestionFour {
    public static void main(String args[]) {

        System.out.println(checkPermutation("tacocat"));
    
    }

    public static boolean checkPermutation(String s) {
        int[] countArray = new int[256];

        int oddCount = 0;

        for(char c : s.toCharArray()) {
            countArray[(int)c]++;
            if(countArray[(int)c] % 2 == 0) oddCount--;
            else oddCount++;
        }
        
        if(oddCount > 1) return false;

        return true;
    }
}
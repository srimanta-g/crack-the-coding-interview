class QuestionThree {
    public static void main(String args[]) {
        System.out.println(URLify("Mr John Smith    ", 13));
    }


    public static String URLify(String str, int n) {
        char[] tempArray = str.toCharArray();

        int i = str.length() - 1;
        int j = n - 1;

        while(j>=0) {
            if(tempArray[j] == ' ') {
                tempArray[i] = '0';
                tempArray[i-1] = '2';
                tempArray[i-2] = '%';

                i = i - 3;
                j--;
            } else {
                tempArray[i] = tempArray[j];
                i--;
                j--;
            }
        }

        return new String(tempArray);
    }
}
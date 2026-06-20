public class Solution {
    public static int countCharacters(String[] words, String chars) {
        int[] charsCount = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charsCount[ch - 'a']++;
            }
        }

        int total = 0;
        for (String word : words) {
            int[] wordCount = new int[26];
            int validLen = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    wordCount[ch - 'a']++;
                    validLen++;
                }
            }

            boolean good = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charsCount[i]) {
                    good = false;
                    break;
                }
            }

            if (good) {
                total += validLen;
            }
        }
        return total;
    }
}
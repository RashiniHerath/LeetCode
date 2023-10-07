
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26]; // Initialize an array to store character counts

        // Count the characters in string s
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Subtract the counts of characters in string t
        for (char ch : t.toCharArray()) {
            charCount[ch - 'a']--;
        }

        // Find the character with a count of -1, which indicates the added letter
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == -1) {
                return (char) (i + 'a');
            }
        }

        return ' '; // This should not happen for valid inputs
    }
}
   
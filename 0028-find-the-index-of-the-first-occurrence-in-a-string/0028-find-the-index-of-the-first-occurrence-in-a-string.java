public class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // Edge case: If the needle is an empty string, return 0
        if (needleLength == 0) {
            return 0;
        }

        // Iterate through the haystack string
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring of haystack starting at index i matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Found a match, return the starting index
            }
        }

        return -1; // If the needle is not found in the haystack
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1)); // Output should be 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); // Output should be -1
    }
}

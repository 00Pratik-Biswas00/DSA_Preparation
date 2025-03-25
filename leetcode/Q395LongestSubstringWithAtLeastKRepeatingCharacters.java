public class Q395LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        if (s == null || s.isEmpty())
            return 0;
        int maxLen = 0;
        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {
            maxLen = Math.max(maxLen, findMaxSubstring(s, k, uniqueTarget));
        }
        return maxLen;
    }

    private int findMaxSubstring(String s, int k, int uniqueTarget) {
        int[] charCount = new int[26]; // Frequency array for characters
        int left = 0, right = 0; // Sliding window pointers
        int unique = 0, countAtLeastK = 0, maxLen = 0;

        while (right < s.length()) {
            // Expand window: Add the character at 'right' to the count array
            if (charCount[s.charAt(right) - 'a']++ == 0)
                unique++; // New unique character
            if (charCount[s.charAt(right) - 'a'] == k)
                countAtLeastK++; // Character now meets k frequency
            right++;

            // Shrink window if unique characters exceed the target
            while (unique > uniqueTarget) {
                if (charCount[s.charAt(left) - 'a'] == k)
                    countAtLeastK--; // Removing a character that met k
                if (--charCount[s.charAt(left) - 'a'] == 0)
                    unique--; // Character removed completely
                left++;
            }

            // Check if the window is valid (all characters appear at least k times)
            if (unique == uniqueTarget && unique == countAtLeastK) {
                maxLen = Math.max(maxLen, right - left);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Q395LongestSubstringWithAtLeastKRepeatingCharacters solution = new Q395LongestSubstringWithAtLeastKRepeatingCharacters();
        System.out.println(solution.longestSubstring("aaabb", 3)); // Output: 3
        System.out.println(solution.longestSubstring("ababbc", 2)); // Output: 5
    }
}
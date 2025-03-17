import java.util.HashSet;
import java.util.Set;

public class Q3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = Integer.MIN_VALUE;
        if (s == null || s.isEmpty())
            return 0;
        // for (int i = 0; i < s.length(); i++) {
        // Set<Character> charSet = new HashSet<>();
        // for (int j = i; j < s.length(); j++) {
        // char currChar = s.charAt(j);
        // if (charSet.contains(currChar))
        // break;
        // charSet.add(currChar);
        // if (s.substring(i, j + 1).length() > ans)
        // ans = s.substring(i, j + 1).length();
        // }
        // }
        int i = 0;
        Set<Character> charSet = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            char currChar = s.charAt(j);
            while (charSet.contains(currChar)) {
                charSet.remove(s.charAt(i));
                i++;
            }

            charSet.add(currChar);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Q3LongestSubstringWithoutRepeatingCharacters obj = new Q3LongestSubstringWithoutRepeatingCharacters();
        System.out.println(obj.lengthOfLongestSubstring("bb"));
    }
}

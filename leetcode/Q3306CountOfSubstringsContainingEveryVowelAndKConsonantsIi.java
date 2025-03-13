import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3306CountOfSubstringsContainingEveryVowelAndKConsonantsIi {
    public long countOfSubstrings(String word, int k) {
        // String vowels = "aeiou";
        // int ans = 0;
        // Set<Character> vowelSet = new HashSet<>();
        // for (char ch : vowels.toCharArray())
        // vowelSet.add(ch);
        // for (int i = 0; i < word.length(); i++) {
        // int c = 0;
        // Set<Character> currentVowels = new HashSet<>();
        // for (int j = i; j < word.length(); j++) {
        // char ch = Character.toLowerCase(word.charAt(j));
        // if (vowelSet.contains(ch))
        // currentVowels.add(ch);
        // else if (Character.isLetter(ch))
        // c++;

        // if (c > k)
        // break;

        // if (currentVowels.size() == 5 && c == k)
        // ans++;
        // }
        // }
        // return ans;
        return atleast(word, k) - atleast(word, k + 1);
    }

    private boolean isConsonant(char ch) {
        return (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u');
    }

    private boolean isVowels(int freq[]) {
        return (freq['a' - 'a'] > 0 && freq['e' - 'a'] > 0 && freq['i' - 'a'] > 0 && freq['o' - 'a'] > 0
                && freq['u' - 'a'] > 0);
    }

    private long atleast(String word, int k) {
        long count = 0;
        int freq[] = new int[26];
        int n = word.length();
        int currentConsonant = 0, left = 0;

        for (int right = 0; right < n; right++) {
            // expansion
            char rightChar = word.charAt(right);
            if (isConsonant(rightChar))
                currentConsonant++;
            freq[rightChar - 'a']++;

            // shrink
            while (currentConsonant >= k && isVowels(freq)) {
                count += (n - right);
                char leftChar = word.charAt(left);
                if (isConsonant(leftChar))
                    currentConsonant--;
                freq[leftChar - 'a']--;

                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q3306CountOfSubstringsContainingEveryVowelAndKConsonantsIi obj = new Q3306CountOfSubstringsContainingEveryVowelAndKConsonantsIi();

        System.out.println(obj.countOfSubstrings("iqeaouqi", 2));

    }
}

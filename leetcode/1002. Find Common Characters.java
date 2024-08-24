import java.util.*;

class FindCommonChar {
  public List<String> commonChars(String[] words) {
    List<String> result = new ArrayList<>();

    if (words == null || words.length == 0) {
      return result;
    }

    // Initialize frequency array for the first word
    int[] minFreq = new int[26];
    Arrays.fill(minFreq, Integer.MAX_VALUE);

    for (String word : words) {
      int[] charCount = new int[26];

      // Count frequency of each character in the current word
      for (char c : word.toCharArray()) {
        charCount[c - 'a']++;
      }

      // Update the minimum frequency array
      for (int i = 0; i < 26; i++) {
        minFreq[i] = Math.min(minFreq[i], charCount[i]);
      }
    }

    // Collect common characters based on the minimum frequency array
    for (int i = 0; i < 26; i++) {
      while (minFreq[i] > 0) {
        result.add(String.valueOf((char) (i + 'a')));
        minFreq[i]--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    FindCommonChar solution = new FindCommonChar();

    String[] words1 = { "bella", "label", "roller" };
    System.out.println(solution.commonChars(words1)); // Output: ["e", "l", "l"]

    String[] words2 = { "cool", "lock", "cook" };
    System.out.println(solution.commonChars(words2)); // Output: ["c", "o"]
  }
}

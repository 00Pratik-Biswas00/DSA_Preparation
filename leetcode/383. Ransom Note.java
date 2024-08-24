import java.util.HashMap;
import java.util.Map;

class RansomNote {

  public static boolean canConstruct(String ransomNote, String magazine) {
    // Create a frequency map to count character occurrences in magazine
    Map<Character, Integer> charFrequency = new HashMap<>();

    // Populate the frequency map for magazine
    for (char ch : magazine.toCharArray()) {
      charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
    }

    // Check each character in ransomNote against the frequency map
    for (char ch : ransomNote.toCharArray()) {
      if (!charFrequency.containsKey(ch) || charFrequency.get(ch) == 0) {
        // If character not found in magazine or used up, return false
        return false;
      }
      // Decrease the count of the character in the frequency map
      charFrequency.put(ch, charFrequency.get(ch) - 1);
    }

    // If all characters in ransomNote can be constructed, return true
    return true;
  }

  public static void main(String[] args) {
    // Test cases
    String ransomNote1 = "a";
    String magazine1 = "b";
    System.out.println(canConstruct(ransomNote1, magazine1)); // Output: false

    String ransomNote2 = "aa";
    String magazine2 = "ab";
    System.out.println(canConstruct(ransomNote2, magazine2)); // Output: false

    String ransomNote3 = "aa";
    String magazine3 = "aab";
    System.out.println(canConstruct(ransomNote3, magazine3)); // Output: true
  }
}

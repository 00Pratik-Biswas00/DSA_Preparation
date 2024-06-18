import java.util.*;

class ReverseVowels {

  private static final Set<Character> vowels = new HashSet<>(
      Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

  public static String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    int left = 0, right = sb.length() - 1;

    while (left < right) {
      while (left < right && !isVowel(sb.charAt(left))) {
        left++;
      }
      while (left < right && !isVowel(sb.charAt(right))) {
        right--;
      }
      if (left < right) {
        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);
        left++;
        right--;
      }
    }
    return sb.toString();
  }

  private static boolean isVowel(char c) {
    return vowels.contains(c);
  }

  public static void main(String[] args) {
    String s = "hello";
    String reversedVowels = reverseVowels(s);
    System.out.println(reversedVowels);
  }
}

import java.util.*;

public class Longest_palindrome {
  public static int longestPalindrome(String x) {
    int[] charCount = new int[128];
    for (char c : x.toCharArray()) {
      charCount[c]++;
    }
    int palindrome_length = 0;
    int odd_count = 0;
    for (int count : charCount) {
      palindrome_length += count / 2 * 2;
      if (count % 2 == 1) {
        odd_count = 1;
      }
    }
    // System.out.println(palindrome_length);
    // System.out.println(odd_count);
    return palindrome_length + odd_count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    int isPalindrome = longestPalindrome(choice);
    System.out.println(isPalindrome);
    sc.close();
  }
}

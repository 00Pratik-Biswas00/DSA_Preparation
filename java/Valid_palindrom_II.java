import java.util.*;

public class Valid_palindrom_II {
  public static boolean isPalindrome(String x, int s, int e) {
    while (s <= e) {
      if (x.charAt(s) != x.charAt(e))
        return false;
      s++;
      e--;
    }
    return true;
  }

  public static boolean checkPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
      }
      start++;
      end--;

    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    boolean isPalindrome = checkPalindrome(choice.toLowerCase());
    System.out.println(isPalindrome);
    sc.close();
  }
}

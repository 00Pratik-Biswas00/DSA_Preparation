import java.util.*;

public class Valid_palindrome {
  public static boolean isPalindrome(String x) {
    String temp = x.toLowerCase();
    int l = temp.length();
    String res = "";
    for (int i = 0; i < l; i++) {
      int char_ascii = (int) temp.charAt(i);
      if (char_ascii >= 97 && char_ascii <= 122 || char_ascii <= 57 && char_ascii >= 48) {
        res += (char) char_ascii;
      }
    }
    System.out.println(res);
    String rev = "";
    boolean ans = false;

    for (int i = res.length() - 1; i >= 0; i--) {
      rev = rev + res.charAt(i);
    }
    System.out.println(rev);
    if (res.equals(rev)) {
      ans = true;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    boolean isPalindrome = isPalindrome(choice);
    System.out.println(isPalindrome);
    sc.close();
  }
}

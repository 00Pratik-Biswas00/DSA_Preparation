import java.util.*;

public class palindrome_check {
  public static boolean isPalindrome(int x) {
    int temp = x;
    int sum = 0;
    while (x > 0) {
      int r = x % 10;
      sum = sum * 10 + r;
      x /= 10;
    }
    if (temp == sum)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    boolean isPalindrome = isPalindrome(choice);
    System.out.println(isPalindrome);
    sc.close();
  }
}

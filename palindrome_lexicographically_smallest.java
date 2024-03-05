import java.util.*;

public class palindrome_lexicographically_smallest {
  public static String can_palindromeString(String s) {
    char[] charArray = s.toCharArray();
    int n = charArray.length;

    for (int start = 0; start < n / 2; start++) {
      int end = n - 1 - start;
      charArray[start] = (char) smaller_ascii(charArray[start], charArray[end]);
      charArray[end] = (char) smaller_ascii(charArray[start], charArray[end]);
    }

    return new String(charArray);
  }

  public static int smaller_ascii(int s, int e) {
    int smallest = s;

    int currentChar = e;
    if (currentChar < smallest) {
      smallest = currentChar;

    }

    return smallest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    System.out.println(can_palindromeString(choice.toLowerCase()));
    sc.close();
  }
}
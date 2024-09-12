package others;

import java.util.Scanner;

public class rev {

  public String reve(String st) {

    char[] charArray = st.toCharArray();
    int n = charArray.length;
    int i = 0, j = n - 1;
    while (i < j) {
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;

      i++;
      j--;
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    rev r = new rev();
    String ab = r.reve(str);
    System.out.println(ab);
  }
}

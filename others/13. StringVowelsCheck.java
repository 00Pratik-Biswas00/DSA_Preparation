package others;

import java.util.Scanner;

class StringVowelsCheck {
  public void tuki(String n) {
    int v = 0, s = 0, c = 0, d = 0;
    for (char i : n.toLowerCase().toCharArray()) {
      d++;
      if (i == '!' || i == '@' || i == '#' || i == '$' || i == '&')
        s++;
      else if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
        v++;
      else
        c++;

    }
    System.out.println(v + " " + c + " " + d + " " + s);

  }

  public static void main(String args[]) {
    StringVowelsCheck t = new StringVowelsCheck();
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    t.tuki(n);
    sc.close();

  }
}

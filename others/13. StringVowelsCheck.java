package others;

import java.util.Scanner;

class StringVowelsCheck {
  public void tuki(String n) {
    int v = 0, s = 0, c = 0, d = 0;
    String vowels = "aeiou";
    String digits = "0123456789";
    String specials = "@#$%!*&^";
    for (char i : n.toLowerCase().toCharArray()) {
      if (vowels.contains(Character.toString(i)))
        v++;
      else if (digits.contains(Character.toString(i)))
        d++;
      else if (specials.contains(Character.toString(i)))
        s++;
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

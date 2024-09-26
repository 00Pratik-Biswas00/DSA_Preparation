package others;

import java.util.Scanner;

class ToogleBinaryDigits {
  public void tuki(int n) {
    String binary = Integer.toBinaryString(n);
    StringBuilder st = new StringBuilder();
    for (char i : binary.toCharArray()) {
      if (i == '1')
        st.append('0');
      else
        st.append('1');
    }
    int res = Integer.parseInt(st.toString(), 2);
    System.out.println(res);

  }

  public static void main(String args[]) {
    ToogleBinaryDigits t = new ToogleBinaryDigits();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    t.tuki(n);
    sc.close();

  }
}

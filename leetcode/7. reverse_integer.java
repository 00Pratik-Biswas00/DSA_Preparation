
import java.util.*;

class reverse_integer {

  public static int reverse(int x) {
    int revNo = 0;
    while (x != 0) {
      Integer lastDigit = x % 10;
      x = x / 10;
      if (revNo > Integer.MAX_VALUE / 10 || revNo < Integer.MIN_VALUE / 10)
        return 0;
      revNo = (revNo * 10) + lastDigit;
    }
    return revNo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Integer.MAX_VALUE);
    System.out.println(reverse(n));

    sc.close();
  }
}
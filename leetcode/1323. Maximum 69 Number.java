class Max69Number {
  public static int maximum69Number(int num) {
    int t = num;
    int index = -1;
    int count = 0;

    while (t > 0) {
      int lastDigit = t % 10;
      if (lastDigit == 6)
        index = count;

      count++;
      t /= 10;
    }
    if (index == -1)
      return num;

    return num + 3 * (int) Math.pow(10, index);
  }

  public static void main(String[] args) {
    System.out.println(maximum69Number(9969));
  }
}

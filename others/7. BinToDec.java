package others;

class binToDec {
  public static void main(String[] args) {
    int ans = 0;
    int a = 11111010;
    String temp = Integer.toString(a);
    int[] newGuess = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
      newGuess[i] = temp.charAt(i) - '0';
    }
    int n = newGuess.length;
    for (int i = n; i > 0; i--) {
      ans += (Math.pow(2, n - i) * newGuess[i - 1]);
    }
    System.out.println(ans);
  }
}

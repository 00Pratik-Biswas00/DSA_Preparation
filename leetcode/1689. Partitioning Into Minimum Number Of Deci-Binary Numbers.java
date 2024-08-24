class DeciBinary {
  public static int minPartitions(String n) {
    int max = 0;
    for (int i = 0; i < n.length(); ++i) {
      int numberAt = n.charAt(i) - '0';
      if (max < numberAt) {
        max = numberAt;
      }
      if (max == 9)
        break;
    }
    return max;
  }

  public static void main(String[] args) {
    String s = "27346209830709182346";
    System.out.println(minPartitions(s));
  }
}

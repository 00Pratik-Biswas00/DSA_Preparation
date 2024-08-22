class Isomorphic {
  public static boolean isIsomorphic(String s, String t) {
    int[] index1 = new int[200];
    int[] index2 = new int[200];

    if (s.length() != t.length())
      return false;

    for (int i = 0; i < s.length(); i++) {
      if (index1[s.charAt(i)] != index2[t.charAt(i)])
        return false;

      index1[s.charAt(i)] = i + 1;
      index2[t.charAt(i)] = i + 1;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isIsomorphic("egg", "add"));
  }
}

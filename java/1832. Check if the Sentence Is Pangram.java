class Pangram {
  public static boolean checkIfPangram(String sentence) {
    int hashArray[] = new int[26];
    for (int i = 0; i < sentence.length(); i++) {
      // int ascii = sentence.charAt(i);
      hashArray[sentence.charAt(i) - 'a']++;
    }
    for (int i = 0; i < hashArray.length; i++)
      if (hashArray[i] < 1)
        return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
  }
}

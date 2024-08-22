import java.util.HashMap;
import java.util.Map;

class SortByFrequency {
  public static String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }

    StringBuilder builder = new StringBuilder();
    while (!map.isEmpty()) {
      int max = 0;
      char maxChar = 'a';
      for (Map.Entry<Character, Integer> e : map.entrySet()) {
        if (e.getValue() > max) {
          maxChar = e.getKey();
          max = e.getValue();
        }
      }

      for (int i = 0; i < max; i++) {
        builder.append(maxChar);
      }

      map.remove(maxChar);
    }

    return builder.toString();
  }

  public static void main(String[] args) {
    System.out.println(frequencySort("tree"));
  }
}

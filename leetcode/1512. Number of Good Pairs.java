import java.util.HashMap;

class GoodPair {
  public static int numIdenticalPairs(int[] nums) {
    int c = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int ams : map.values()) {
      c += ams * (ams - 1) / 2;
    }
    return c;

  }

  public static void main(String[] args) {
    int[] s = { 1, 1, 1, 1 };
    System.out.println(numIdenticalPairs(s));
  }
}

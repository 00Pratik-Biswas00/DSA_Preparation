import java.util.HashMap;

class SubarraysSumEqualsToK {

  public static int subarraySum(int[] nums, int k) {
    int prefixSum = 0;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];
      int remove = prefixSum - k;
      count += map.getOrDefault(remove, 0);
      map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3 };
    System.out.println(subarraySum(nums, 3));
  }
}

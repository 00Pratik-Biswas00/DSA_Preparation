class CanJump {

  public static boolean canJump(int[] nums) {
    int maxReach = 0; // The furthest point we can reach

    for (int i = 0; i < nums.length; i++) {
      if (i > maxReach) {
        return false; // If current index is beyond maxReach, we can't move further
      }
      maxReach = Math.max(maxReach, i + nums[i]); // Update maxReach

      if (maxReach >= nums.length - 1) {
        return true; // If we can reach the last index, return true
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 3, 1, 1, 4 };
    System.out.println(canJump(nums));
  }
}

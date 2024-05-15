class IncreasingTripletSeq {
  public static boolean increasingTriplet(int[] nums) {
    int firstMin = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int num : nums) {
      if (num <= firstMin) {
        firstMin = num; // Update the smallest element encountered so far
      } else if (num <= secondMin) {
        secondMin = num; // Update the second smallest element encountered so far
      } else {
        // Found a third element greater than both firstMin and secondMin
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 1, 5, 0, 4, 6 };
    System.out.println(increasingTriplet(nums));
  }
}

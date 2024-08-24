class rearrangeArray {

  public static int[] rearrange_array(int[] nums) {
    int arr[] = new int[nums.length];
    int posIndex = 0, negIndex = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        arr[negIndex] = nums[i];
        negIndex += 2;
      } else {
        arr[posIndex] = nums[i];
        posIndex += 2;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int nums[] = { 3, 1, -2, -5, 2, -4 };
    int[] result = rearrange_array(nums);

    // Print the elements of the result array
    for (int i = 0; i < result.length; i++)
      System.out.print(result[i] + " ");
  }
}

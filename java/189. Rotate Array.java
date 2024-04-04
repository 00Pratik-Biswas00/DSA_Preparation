import java.util.Arrays;

class rotateByOne {

  public static void rotate(int[] nums, int k) {

    int array_length = nums.length;
    int[] temp_array = new int[nums.length];

    // Copy the original nums array to temp_array
    for (int i = 0; i < array_length; i++) {
      temp_array[i] = nums[i];
    }

    // Rotate the elements in nums array (i + k) % array_length = if k=14 and arr
    // length is 14 then it will give the result 0 first and continue...
    for (int i = 0; i < array_length; i++) {
      int newPos = (i + k) % array_length; // circular
      nums[newPos] = temp_array[i];
    }

    String str = Arrays.toString(nums);
    str = str.replaceAll(" ", "");
    System.out.println(str);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

    int k = 3;
    rotate(arr, k);
  }
}

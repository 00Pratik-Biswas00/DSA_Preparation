public class Q3191MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public int minOperations(int[] nums) {
        int ans = 0;
        if (nums.length < 3)
            return -1;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ans++;
            }

        }
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 1) {
                return -1;
            }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0 };
        Q3191MinimumOperationsToMakeBinaryArrayElementsEqualToOneI obj = new Q3191MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
        System.out.println(obj.minOperations(arr));
    }
}

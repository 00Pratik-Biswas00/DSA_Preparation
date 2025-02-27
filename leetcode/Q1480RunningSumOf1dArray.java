public class Q1480RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        Q1480RunningSumOf1dArray obj = new Q1480RunningSumOf1dArray();
        int nums[] = { 1, 2, 3, 4 };
        int[] array = obj.runningSum(nums);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

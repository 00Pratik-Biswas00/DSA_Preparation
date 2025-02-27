public class Q1929ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Q1929ConcatenationOfArray obj = new Q1929ConcatenationOfArray();
        int nums[] = { 0, 2, 8 };
        int[] array = obj.getConcatenation(nums);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

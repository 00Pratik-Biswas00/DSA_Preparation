public class Q1920BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int arr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        Q1920BuildArrayFromPermutation obj = new Q1920BuildArrayFromPermutation();
        int nums[] = { 0, 2, 1, 5, 3, 4 };
        int[] array = obj.buildArray(nums);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

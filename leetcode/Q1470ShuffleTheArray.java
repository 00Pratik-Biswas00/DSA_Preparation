public class Q1470ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int ind = 0;
        int arr[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[ind++] = nums[i];
            arr[ind++] = nums[i + n];
        }
        return arr;
    }

    public static void main(String[] args) {
        Q1470ShuffleTheArray obj = new Q1470ShuffleTheArray();
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        int[] array = obj.shuffle(nums, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

public class Q215KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is empty");
        int left = 0, right = nums.length - 1, kth;
        while (true) {
            int idx = partition(nums, left, right);
            if (idx == k - 1) {
                kth = nums[idx];
                break;
            }
            if (idx < k - 1) {
                left = idx + 1;
            } else {
                right = idx - 1;
            }
        }
        return kth;
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            if (arr[l] < pivot && arr[r] > pivot) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            if (arr[l] >= pivot) {
                l++;
            }
            if (arr[r] <= pivot) {
                r--;
            }
        }
        int temp2 = arr[left];
        arr[left] = arr[r];
        arr[r] = temp2;
        return r;
    }

    public static void main(String[] args) {
        Q215KthLargestElementInAnArray obj = new Q215KthLargestElementInAnArray();
        int[] arr = { 12, 3, 5, 7, 19 };
        int K = 2;
        System.out.println(obj.findKthLargest(arr, K));
    }
}

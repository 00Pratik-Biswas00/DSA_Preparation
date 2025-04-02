public class Q2873MaximumValueOfAnOrderedTripletI {
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3)
            return 0; // Not enough elements to form a triplet

        // Step 1: Compute prefix_max
        int[] prefix_max = new int[n];
        prefix_max[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_max[i] = Math.max(prefix_max[i - 1], nums[i]);
        }

        // Step 2: Compute suffix_max
        int[] suffix_max = new int[n];
        suffix_max[n - 1] = nums[n - 1];
        for (int k = n - 2; k >= 0; k--) {
            suffix_max[k] = Math.max(suffix_max[k + 1], nums[k]);
        }

        // Step 3: Iterate over j and calculate the max triplet value
        long maxVal = 0;
        for (int j = 1; j < n - 1; j++) { // j is the middle index
            long leftMax = prefix_max[j - 1]; // max nums[i] for i < j
            long rightMax = suffix_max[j + 1]; // max nums[k] for k > j
            long tripletValue = (leftMax - nums[j]) * rightMax;
            maxVal = Math.max(maxVal, tripletValue);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 12, 7 };
        System.out.println(maximumTripletValue(arr));
    }
}

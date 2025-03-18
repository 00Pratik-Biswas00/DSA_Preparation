public class Q2401LongestNiceSubarray {
    // var length sliding window + bit masking
    public int longestNiceSubarray(int[] nums) {
        int start = 0, ans = 0, bitMask = 0;
        for (int end = 0; end < nums.length; end++) {
            // shrinking
            while ((bitMask & nums[end]) != 0) {
                bitMask = bitMask ^ nums[start];
                start++;
            }
            // expansion
            bitMask = bitMask | nums[end];
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2401LongestNiceSubarray obj = new Q2401LongestNiceSubarray();
        int arr[] = { 1, 3, 8, 48, 10 };
        System.out.println(obj.longestNiceSubarray(arr));
    }
}


public class Q2206DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q2206DivideArrayIntoEqualPairs obj = new Q2206DivideArrayIntoEqualPairs();
        int arr[] = { 3, 2, 3, 2, 2, 2 };
        System.out.println(obj.divideArray(arr));
    }
}

class maxProdArray {

  public static int max_ProdArray(int[] nums) {
    int pref = 1, suff = 1;
    int max_prod = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (pref == 0)
        pref = 1;
      if (suff == 0)
        suff = 1;

      pref *= nums[i];
      suff *= nums[nums.length - i - 1];
      max_prod = Math.max(max_prod, Math.max(pref, suff));
    }
    return max_prod;
  }

  public static void main(String[] args) {
    int nums[] = { 3, -1, 4 };
    System.out.println(max_ProdArray(nums));
  }

}

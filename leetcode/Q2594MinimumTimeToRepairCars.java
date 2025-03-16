public class Q2594MinimumTimeToRepairCars {
    public long repairCars(int[] ranks, int cars) {
        long low = 0, high = ranks[0] * cars * cars;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long canRepair = 0;
            for (int r : ranks) {
                canRepair += Math.sqrt(mid / r);

            }
            if (canRepair >= cars) {
                high = mid - 1;
                ans = mid;
            } else
                low = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        Q2594MinimumTimeToRepairCars obj = new Q2594MinimumTimeToRepairCars();
        int[] arr = { 4, 2, 3, 1 };
        System.out.println(obj.repairCars(arr, 10));
    }
}

public class Q754ReachANumber {
    public int reachNumber(int target) {
        int sum = 0, steps = 0;
        target = Math.abs(target);
        while (sum < target) {
            sum += steps;
            steps++;

        }
        while ((sum - target) % 2 != 0) {
            sum += steps;
            steps++;
        }
        return steps - 1;
    }

    public static void main(String[] args) {
        Q754ReachANumber obj = new Q754ReachANumber();
        System.out.println(obj.reachNumber(3));
    }
}

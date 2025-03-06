public class Q1769MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int countBalls = 0;
        int prevSteps = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = prevSteps;
            if (boxes.charAt(i) == '1') {
                countBalls++;
            }
            prevSteps += countBalls;
        }

        countBalls = 0;
        prevSteps = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += prevSteps;

            if (boxes.charAt(i) == '1') {
                countBalls++;
            }
            prevSteps += countBalls;
        }

        return answer;
    }

    public static void main(String[] args) {
        Q1769MinimumNumberOfOperationsToMoveAllBallsToEachBox obj = new Q1769MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        int arr[] = obj.minOperations("110");
        for (Integer i : arr)
            System.out.println(i);
    }
}

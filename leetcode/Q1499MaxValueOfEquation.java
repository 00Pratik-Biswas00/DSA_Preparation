import java.util.PriorityQueue;

public class Q1499MaxValueOfEquation {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int row = points.length;
        int col = points[0].length;
        int ans = Integer.MIN_VALUE;
        // brute force type
        // for (int i = 0; i < row; i++) {
        // for (int j = i + 1; j < col; j++) {
        // if (Math.abs(points[i][0] - points[j][0]) <= k) {
        // ans = Math.max(ans, points[i][1] + points[j][1] + Math.abs(points[i][0] -
        // points[j][0]));
        // }
        // }
        // }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max heap based on yi - xi

        for (int[] point : points) {
            int xj = point[0];
            int yj = point[1];

            // Remove points from heap where (xi, yi) such that |xi - xj| > k
            while (!queue.isEmpty() && queue.peek()[1] < xj - k) {
                queue.poll();
            }

            if (!queue.isEmpty()) {
                int[] top = queue.peek(); // the current max yi - xi
                ans = Math.max(ans, top[0] + yj + xj); // calculate potential max value
            }

            queue.offer(new int[] { yj - xj, xj }); // Push current point transformed as yi - xi
        }

        return ans;
    }

    public static void main(String[] args) {
        Q1499MaxValueOfEquation obj = new Q1499MaxValueOfEquation();
        int[][] arr = { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
        // int[][] arr = { { 0, 0 }, { 3, 0 }, { 9, 2 } };
        System.out.println(obj.findMaxValueOfEquation(arr, 1));
    }

}

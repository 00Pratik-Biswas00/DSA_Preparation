import java.util.Arrays;
import java.util.PriorityQueue;

public class Q253MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length < 0)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for (int interval[] : intervals) {
            if (!pQueue.isEmpty() && pQueue.peek() <= interval[0]) {
                pQueue.poll();
            }
            pQueue.add(interval[1]);
        }
        return pQueue.size();
    }

    public static void main(String[] args) {
        int[][] intervals1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        System.out.println(minMeetingRooms(intervals1));
    }
}

import java.util.Map;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q692TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);

        }
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue()
                        ? b.getKey().compareTo(a.getKey()) // If frequencies are equal, compare lexicographically
                        : a.getValue() - b.getValue() // Sort by frequency ascending to maintain top-K in minHeap
        );

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the lowest frequency entry
            }
        }

        // Extract top k elements from the heap into a list in descending order
        List<String> topElements = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topElements.add(minHeap.poll().getKey());
        }

        // Reverse the list because we want the highest frequency first
        Collections.reverse(topElements);
        return topElements;
    }

    public static void main(String[] args) {
        Q692TopKFrequentWords obj = new Q692TopKFrequentWords();
        String arr[] = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
        System.out.println(obj.topKFrequent(arr, 4));
    }
}

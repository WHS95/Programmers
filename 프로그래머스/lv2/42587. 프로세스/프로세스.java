import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // Create a map where the key is the index value of priorities and the value is the corresponding priority value.
        Map<Integer, Integer> priorityMap = new HashMap<>();
        for (int i = 0; i < priorities.length; i++) {
            priorityMap.put(i, priorities[i]);
        }
        
        // Add the priorities from the map to a priority queue.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorityMap.values()) {
            priorityQueue.add(priority);
        }
        
        // Iterate over the priorities in descending order.
        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorityMap.get(i) == priorityQueue.peek()) {
                    if (i == location) {
                        // If the current element is at the desired location, return the counter.
                        return answer + 1;
                    }
                    // Remove the element from the queue and increment the counter.
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

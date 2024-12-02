package lesson4.priorityqueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ArraySortingUtil {
    public static int[] sortByDescending(int [] inputArray) {
        //Comparator for descending order
        Comparator<Integer> integerComparator = (x, y) -> Integer.compare(y, x);
        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>(integerComparator);
        //Adding all array elements into queue
        for (int j : inputArray) {
            sortedQueue.add(j);
        }
        //moving back elements from queue to input array in sorted order
        int index = 0;
        while (!sortedQueue.isEmpty()) {
            inputArray[index++] = sortedQueue.poll();
        }
        return inputArray;
    }
}

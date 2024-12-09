package lesson6.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int [] getIndexes(int [] input, int total) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == total) {
                    return new int [] {i, j};
                }
            }
        }
        return new int [1];
    }

    public static int [] getIndexesViaMap(int [] nums, int total) {
        Map<Integer, Integer> numsIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsIndexes.containsKey(total - nums[i])) {
                return new int [] {numsIndexes.get(total - nums[i]), i};
            }
            numsIndexes.put(nums[i], i);
        }

        return new int []{};
    }
}

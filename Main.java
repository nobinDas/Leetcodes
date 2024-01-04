import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use a map to store the complement of each number and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{complementMap.get(complement), i};
            }

            // Put the current number and its index into the map
            complementMap.put(nums[i], i);
        }

        // No solution found
        return new int[]{};
    }
}

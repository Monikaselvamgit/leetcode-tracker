// Last updated: 7/9/2026, 9:44:13 AM
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        // Mark numbers present by negating the value at the index corresponding to each number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; // convert number to index
            
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // mark as found by negating
            }
        }
        
        // Collect indices where values are positive, meaning those numbers are missing
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                missing.add(i + 1); // index + 1 is missing number
            }
        }
        
        return missing;
    }
}

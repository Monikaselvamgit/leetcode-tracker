// Last updated: 7/9/2026, 9:44:14 AM
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Use TreeSet in descending order to store distinct elements
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        // Add all elements to the set (removes duplicates)
        for (int num : nums) {
            set.add(num);
        }
        
        // If less than 3 distinct elements, return the maximum
        if (set.size() < 3) {
            return set.first();
        }
        
        // Iterate to find the third maximum
        Iterator<Integer> it = set.iterator();
        it.next(); // 1st max
        it.next(); // 2nd max
        return it.next(); // 3rd max
    }
}

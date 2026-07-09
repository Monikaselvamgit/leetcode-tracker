// Last updated: 7/9/2026, 9:44:06 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1, missing = -1;
        
        // Use an array to track counts
        int[] count = new int[n + 1];
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}

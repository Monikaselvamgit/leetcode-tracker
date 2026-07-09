// Last updated: 7/9/2026, 9:43:58 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            // Move left pointer while nums[left] is even
            while (left < right && nums[left] % 2 == 0) left++;
            // Move right pointer while nums[right] is odd
            while (left < right && nums[right] % 2 == 1) right--;
            
            if (left < right) {
                // Swap even and odd elements
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;
                right--;
            }
        }
        
        return nums;
    }
}

// Last updated: 7/9/2026, 9:45:38 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
            }
            }
        }
        return new int[]{};
    }
}
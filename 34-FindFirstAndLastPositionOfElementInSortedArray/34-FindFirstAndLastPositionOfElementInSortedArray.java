// Last updated: 7/9/2026, 9:45:09 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                    first=i;
                    break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
        return new int[]{first,last};
    }
}
// Last updated: 7/9/2026, 9:45:11 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int cv:nums){
            if(k==0||cv!=nums[k-1]){
                nums[k]=cv;
                k++;
            }
        }
        return k;
    }
}
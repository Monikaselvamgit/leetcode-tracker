// Last updated: 7/9/2026, 9:44:59 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int cv:nums){
            if(k<2||cv!=nums[k-2]){
                nums[k]=cv;
                k++;
            }
        }
        return k;
    }
}
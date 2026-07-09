// Last updated: 7/9/2026, 9:45:10 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int cv:nums){
            if(cv!=val){
                nums[k]=cv;
                k++;
            }
        }return k;
    }
}
// Last updated: 7/9/2026, 9:44:50 AM
class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int i:nums){
            n^=i;
        }
        return n;
    }
}
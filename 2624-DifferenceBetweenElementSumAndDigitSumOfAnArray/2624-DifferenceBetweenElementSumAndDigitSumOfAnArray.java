// Last updated: 7/9/2026, 9:43:36 AM
class Solution {
    public int differenceOfSum(int[] nums) {  
        int x =0;
        int y =0;
        for(int i =0;i<nums.length;i++){
            x+=nums[i];
            int j=nums[i];
            while(j>0){
                y+=j%10;
                j/=10;
            }

        }   
        return x-y; 
    }
}
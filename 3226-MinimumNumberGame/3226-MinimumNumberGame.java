// Last updated: 7/9/2026, 9:43:25 AM
class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<arr.length;i+=2){
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];
        }
        return arr;
    }
}
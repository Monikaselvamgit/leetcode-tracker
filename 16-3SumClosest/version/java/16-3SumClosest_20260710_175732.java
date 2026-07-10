// Last updated: 7/10/2026, 5:57:32 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int n=nums.length;
4        int cs=nums[0]+nums[1]+nums[2];
5        for(int i=0;i<n-2;i++){
6            for(int j=i+1;j<n-1;j++){
7                for(int k=j+1;k<n;k++){
8                    int sum=nums[i]+nums[j]+nums[k];
9                    if(Math.abs(target-sum)<Math.abs(target-cs)){
10                        cs=sum;
11                    }
12                    if(sum==target){
13                        return sum;
14                    }
15                }
16            }
17        }
18        return cs;
19    }
20}
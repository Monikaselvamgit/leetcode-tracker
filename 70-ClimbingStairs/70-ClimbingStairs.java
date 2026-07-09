// Last updated: 7/9/2026, 9:45:00 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int a = 1, b = 1 , sum;
        for(int i=2;i<=n;i++){
            sum = a+b;
            a = b;
            b = sum;

        }
        return b;
    }
}
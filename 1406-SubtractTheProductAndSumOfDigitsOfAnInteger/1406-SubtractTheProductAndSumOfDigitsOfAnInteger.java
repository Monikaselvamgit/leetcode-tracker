// Last updated: 7/9/2026, 9:43:51 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int p =1;
        while(n>0){
            sum+=n%10;
            p*=n%10;
            n/=10;
        }
        return(p-sum);
    }
}
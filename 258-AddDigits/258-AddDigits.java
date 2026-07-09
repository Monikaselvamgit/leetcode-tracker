// Last updated: 7/9/2026, 9:44:25 AM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return 1+(num-1)%9;
    }
}
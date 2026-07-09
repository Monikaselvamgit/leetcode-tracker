// Last updated: 7/9/2026, 9:45:24 AM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        if(x<0) return false;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev==x;
    }
}
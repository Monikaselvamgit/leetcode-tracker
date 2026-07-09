// Last updated: 7/9/2026, 9:45:27 AM
class Solution {
    public int reverse(int x) {
        int rev = 0;
        String str = Integer.toString(x);
        while(x!=0){
            int temp = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + temp;
            x/=10;
            
        }
        return rev;
    }
}
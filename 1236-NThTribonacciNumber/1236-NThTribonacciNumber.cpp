// Last updated: 7/9/2026, 9:43:53 AM
class Solution {
public:
    int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        
        for (int i = 3; i <= n; i++) {
            int nextTrib = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = nextTrib;
        }
        
        return t2;
    }
};
// Last updated: 7/9/2026, 9:43:39 AM
class Solution {

    public int pivotInteger(int n) {

        for(int pivot = 1; pivot <= n; pivot++)
        {
            int leftSum = 0;
            int rightSum = 0;

            for(int i = 1; i <= pivot; i++)
            {
                leftSum += i;
            }

            for(int i = pivot; i <= n; i++)
            {
                rightSum += i;
            }

            if(leftSum == rightSum)
            {
                return pivot;
            }
        }

        return -1;
    }
}
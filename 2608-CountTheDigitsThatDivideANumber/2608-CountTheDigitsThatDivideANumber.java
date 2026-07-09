// Last updated: 7/9/2026, 9:43:38 AM
class Solution {
    public int countDigits(int num) {
         int m=num ;
         int count=0;
         int s=0;
         while(m>0){
            s=m%10;
            if(num%s==0){
                count++;
            }
            m/=10;    
         }return count;
    }
}
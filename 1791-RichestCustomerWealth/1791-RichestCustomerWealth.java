// Last updated: 7/9/2026, 9:43:48 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int w1 = 0;
        for(int i =0;i<accounts.length;i++){
            int w2=0;
            for(int j=0;j<accounts[i].length;j++){
                w2+=accounts[i][j];
            }
            if(w1<w2){
                w1=w2;
            }

        }
        return w1;
        
    }
}
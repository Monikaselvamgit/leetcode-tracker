// Last updated: 7/9/2026, 9:43:42 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxc=0;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            maxc=Math.max(maxc,count);
        }
        return maxc;
        
    }
}
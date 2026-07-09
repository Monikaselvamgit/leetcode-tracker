// Last updated: 7/9/2026, 9:44:46 AM
class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
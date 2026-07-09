// Last updated: 7/9/2026, 9:43:23 AM
class Solution {
    public int countKeyChanges(String s) {
        String l=s.toLowerCase();
        int count=0;
        for(int i =0;i<s.length()-1;i++){
            if(l.charAt(i)!=l.charAt(i+1)){
                count++;
                
            }
        }return count;
        
    }
}
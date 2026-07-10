// Last updated: 7/10/2026, 9:45:59 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replaceAll("-","").toUpperCase();
        StringBuilder res=new StringBuilder();
        int fg=s.length()%k;
        int index=0;
        if(fg>0){
            res.append(s.substring(0,fg));
            index=fg;
        }
        while(index<s.length()){
            if(res.length()>0){
                res.append("-");
            }
            res.append(s.substring(index,index+k));
            index+=k;
        }
        return res.toString();
    }
}
// Last updated: 7/10/2026, 6:10:21 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       char[]a=s.toCharArray();
4       char[]b=t.toCharArray();
5       Arrays.sort(a);
6       Arrays.sort(b);
7       if(Arrays.equals(a,b)){
8        return true;
9       }
10       else{
11        return false;
12       }
13    }
14}
// Last updated: 7/9/2026, 9:43:44 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>s=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char c =sentence.charAt(i);
            if(Character.isLetter(c)){
                s.add(c);
            }
            // return s.size()==26;
        }
        // // boolean flags= new boolean[26];
        // for(int i=0;i<sentence.length();i++){
        //     char c = sentence.charAt(i);
        //     for(int j=i;j<sentence.length();j++){
        //         char ch = sentence.charAt(j);
        //         if(Character.isLetter(c)!=Character.isLetter(ch)){
        //             return true;
        //      } }
        // }


        return s.size()==26;
    }
}
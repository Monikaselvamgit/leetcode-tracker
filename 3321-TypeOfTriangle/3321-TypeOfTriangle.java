// Last updated: 7/9/2026, 9:43:28 AM
class Solution {
    public String triangleType(int[] nums) {
        int x =nums[0];
        int y = nums[1];
        int z =nums[2];
        String a = "equilateral";
        String b = "isosceles";
        String c = "scalene";
        String d = "none";
        if(isValidTriangle(x,y,z)){
            if(x==y && x==z && y==z){
                return a;
            }
            else if(x==y || x==z || y==z){
                return b;
            }
            else{
                return c;
            }
        }
        else{
            return d;
        }
    }
    public static boolean isValidTriangle(int x,int y,int z){
        return (x+y > z && x+z > y && y+z > x);
    }
}
// Last updated: 7/9/2026, 9:45:30 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] res=new int[m+n];
        for(int i=0;i<m;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            res[m+i]=nums2[i];
        }
        Arrays.sort(res);
        if(res.length%2 !=0){
            return (double)res[res.length/2];
        }
        else{
            return (double)(res[res.length/2]+res[res.length/2-1])/2.0;
        }
    }
}
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        if(nums1.length!=nums2.length){
            return 0;
        }
        int sum=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums2.length;i++){
            sum=nums2[i]-nums1[i];
        }
        return sum;
    }
}
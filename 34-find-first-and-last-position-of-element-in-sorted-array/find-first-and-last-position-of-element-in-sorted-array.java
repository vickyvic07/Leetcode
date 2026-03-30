class Solution {
    public int[] searchRange(int[] nums, int t) {
        int arr[]={-1,-1};
        int i=0,j=nums.length-1;
       while(i<nums.length){
        if(nums[i]==t){
            arr[0]=i;
            break;
        }i++;
       }
        while(j>=0){
        if(nums[j]==t){
            arr[1]=j;
            break;
        }j--;
       }return arr;
    }
}
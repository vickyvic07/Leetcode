class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[t++]=nums[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(nums[i]%2!=0){
                arr[t++]=nums[i];
            }
        }return arr;
    }
}
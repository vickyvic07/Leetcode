class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int l=0;
        int sum=0;
        int max=0;;
        for(int i=0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[l]);
                sum-=nums[l++];
            }
            s.add(nums[i]);
            sum+= nums[i];
            max=Math.max(max,sum);
            
        }
        return max;
    }
}
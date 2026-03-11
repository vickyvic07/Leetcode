class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n1=2;
            int m=2;
            if(i>0){
                 n1=Math.abs(nums[i]-nums[i-1]);
            }
            if(i<nums.length-1){
                m=Math.abs(nums[i]-nums[i+1]);
            }
            if(n1>1 && m>1){
                n.add(nums[i]);
            }
        }return n;
    }
}
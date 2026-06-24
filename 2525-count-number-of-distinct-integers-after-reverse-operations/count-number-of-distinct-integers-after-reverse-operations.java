class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            sb.reverse();
            set.add(Integer.parseInt(sb.toString()));
        }
        return set.size();
    
    }
}
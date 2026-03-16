class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                c+=nums.get(i);
            }
        }return c;
    }
}
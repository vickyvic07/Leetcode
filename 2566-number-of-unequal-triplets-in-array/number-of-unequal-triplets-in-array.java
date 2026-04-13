class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        int left = 0;
        for (int count : map.values()) {
            int right = nums.length - left - count;
            res += left * count * right;
            left += count;
        }
        return res;
    }
}
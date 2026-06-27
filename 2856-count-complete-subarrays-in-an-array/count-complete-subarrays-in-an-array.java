class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int res = 0;

        List<Integer> st = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!st.contains(nums[i])) {
                st.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < nums.length; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                if (map.size() == st.size()) {
                    res++;
                }
            }
        }

        return res;
    }
}
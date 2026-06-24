class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int c = 0;
        int n = nums.length;

        for (int mask = 1; mask < (1 << n); mask++) {

            List<Integer> l = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    l.add(nums[j]);
                }
            }

            boolean x = true;

            for (int i = 0; i < l.size(); i++) {
                for (int j = i + 1; j < l.size(); j++) {
                    int v = Math.abs(l.get(i) - l.get(j));

                    if (v == k) {
                        x = false;
                        break;
                    }
                }
                if (!x) {
                    break;
                }
            }

            if (x) {
                c++;
            }
        }

        return c;
    }
}
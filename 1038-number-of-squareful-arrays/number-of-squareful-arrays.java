class Solution {
    int ans = 0;
    public int numSquarefulPerms(int[] nums){
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backtrack(nums,used,new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums,boolean[] used,List<Integer>path){
        if (path.size()==nums.length){
            ans++;
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1])
                continue;
            if (!path.isEmpty()){
                int sum=path.get(path.size()-1)+nums[i];
                int root=(int)Math.sqrt(sum);
                if (root*root!=sum)
                    continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, used, path);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i=0;i<l.length;i++){
            List<Integer> temp = new ArrayList<>();
            for (int j=l[i];j<=r[i];j++){
                temp.add(nums[j]);
            }
            Collections.sort(temp);
            boolean b = true;
            int diff=temp.get(1)-temp.get(0);
            for (int j=2;j<temp.size();j++){
                if (temp.get(j)-temp.get(j-1)!=diff){
                    b=false;
                    break;
                }
            }
            result.add(b);
        }
        return result;
    }
}
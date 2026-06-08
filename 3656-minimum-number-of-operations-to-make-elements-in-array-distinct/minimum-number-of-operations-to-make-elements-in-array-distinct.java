class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        int c=0;
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        while(count(s)>0){
            int remove = Math.min(3, s.size());
            for(int i=0;i<remove;i++){
                s.remove(0);
                
            }
            op++;
        }
        return op;
           
           }
           public int count(List<Integer> m){
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<m.size();i++){
                if(!s.add(m.get(i))){
                    return 1;
            }
        }
        return 0;
           }
}
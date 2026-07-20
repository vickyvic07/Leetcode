class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }List<Integer> l=new ArrayList<>();
        for(int k : map.keySet()){
            if(map.get(k)==n){
                l.add(k);
            }
        }
        Collections.sort(l);
        return l;
    }
}
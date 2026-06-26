class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i!=j){
                    StringBuilder s=new StringBuilder(nums[i]);
                    StringBuilder s1=new StringBuilder(nums[j]);
                    s.append(nums[j]);
                    s1.append(nums[i]);
                     if((s.toString().equals(target))){
                    c++;
                }
                if(s1.toString().equals(target)){
                    c++;
                }
                }
               
            }
        }return c;
    }
}
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        List<String> s=new ArrayList<>();
        int i=0;
        int j=nums.length-1;
        while(i<j){
            StringBuilder s1=new StringBuilder();
            s1.append(String.valueOf(nums[i]));
            s1.append(String.valueOf(nums[j]));
            s.add(s1.toString());
            i++;
            j--;  
        }int n1=nums[i];
        long c=0;
        for(int t=0;t<s.size();t++){
            c+=Long.parseLong(s.get(t));
        }if(nums.length%2!=0){
            c+=n1;
        }return c;
    }
}
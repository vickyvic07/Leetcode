class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        List<Integer> l=new ArrayList<>();
         List<Integer> r=new ArrayList<>();
          List<Integer> p=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }else if(nums[i]==pivot){
                p.add(nums[i]);
            }else{
                r.add(nums[i]);
            }
         }int j=0;
         for(int i=0;i<l.size();i++){
            arr[j++]=l.get(i);
         }for(int i=0;i<p.size();i++){
            arr[j++]=p.get(i);
         }for(int i=0;i<r.size();i++){
            arr[j++]=r.get(i);
         }return arr;
    }
}
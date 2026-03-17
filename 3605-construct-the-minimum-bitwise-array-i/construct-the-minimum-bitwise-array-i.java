class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        List<Integer> n=new ArrayList<>();
        int t=0;
        for(int i=0;i<nums.size();i++){
            int x=0;
            int tar=nums.get(i);
            boolean f=false;
            for(int j=0;j<=tar;j++){
                int c=x+1;
                if((x|c)==tar){
                    n.add(x);
                    f=true;
                    break;
                }x++;
            }if(!f){
                n.add(-1);
            }
        }int arr[]=new int[n.size()];
        for(int i=0;i<n.size();i++){
            arr[i]=n.get(i);
        }return arr;
    }
}
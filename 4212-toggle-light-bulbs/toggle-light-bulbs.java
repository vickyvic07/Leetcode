class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> b) {
        List<Integer> n=new ArrayList<>();
        int arr[]=new int[101];
        for(int a:b){
            arr[a]++;
        }for(int i=1;i<arr.length;i++){
            if(arr[i]%2!=0){
                n.add(i);
            }
        }return n;
    }
}
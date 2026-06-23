class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> a=new ArrayList<>();
        Arrays.sort(arr);
        int max=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int min=arr[i]-arr[i-1];
            if(min<max){
                max=min;
                a.clear();
                a.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(max==min){
                a.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }return a;
    }
}
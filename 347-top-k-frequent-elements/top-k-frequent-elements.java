class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> n=new ArrayList<>();
        Map<Integer,Integer> n1=new TreeMap<>();
        for(int f: nums){
            n1.put(f,n1.getOrDefault(f,0)+1);
        }
        for(int i=0;i<k;i++){
            int m=0;
            int s=0;
            for(Map.Entry<Integer,Integer> entry:n1.entrySet()){
                if(entry.getValue()>m){
                    m=entry.getValue();
                    s=entry.getKey();
                }
            }
            n.add(s);
            n1.put(s,-1);
        }int arr[]=new int[n.size()];
        for(int i=0;i<n.size();i++){
            arr[i]=n.get(i);
        }return arr;
    }
}
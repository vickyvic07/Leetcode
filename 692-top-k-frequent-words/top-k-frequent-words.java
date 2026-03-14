class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> n=new ArrayList<>();
        Map<String,Integer> n1=new TreeMap<>();
        for(String f:words){
            n1.put(f,n1.getOrDefault(f,0)+1);
        }
        for(int i=0;i<k;i++){
            int m=0;
            String s="";
            for(Map.Entry<String,Integer> entry:n1.entrySet()){
                if(entry.getValue()>m){
                    m=entry.getValue();
                    s=entry.getKey();
                }
            }
            n.add(s);
            n1.put(s,-1);
        }return n;

    }
}
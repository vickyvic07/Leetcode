class Solution {
    public String findCommonResponse(List<List<String>> res) {
        String v="";
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<res.size();i++){
            Set<String> st=new HashSet<>();
            for(int j=0;j<res.get(i).size();j++){
                st.add(res.get(i).get(j));
            }
            for(String k : st){
                map.put(k,map.getOrDefault(k,0)+1);
            }
        }int m=0;
        for(String key : map.keySet()){
            int f=map.get(key);
            if(f>m || (f==m && key.compareTo(v)<0)){
                m=f;
                v=key;
            }
        }
        return v;
    }
}
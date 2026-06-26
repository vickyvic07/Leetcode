class Solution {
    public int partitionString(String s) {
        List<String> l=new ArrayList<>();
        String m="";
        for(char c : s.toCharArray()){
            if(m.contains(String.valueOf(c))){
                l.add(m);
                m="";
                m+=c;
            }else{
                m+=c;
            }
        }
        l.add(m);
        return l.size();
        
    }
}
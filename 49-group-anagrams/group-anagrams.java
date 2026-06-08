class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> s=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            if(!s.containsKey(Arrays.toString(arr))){
                s.put(Arrays.toString(arr),new ArrayList<>());
            }
            s.get(Arrays.toString(arr)).add(strs[i]);
        }List<List<String>> s1=new ArrayList<>();
        for(String s2 : s.keySet()){
            List<String> s3=s.get(s2);
            s1.add(s3);

        }return s1;
    }
}
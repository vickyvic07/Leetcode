import java.util.*;

class Solution {
    public String getHappyString(int n, int k) {
        String s2 = "abc";
        List<String> list = new ArrayList<>();
        list.add("");
        for(int i=0;i<n;i++){
            List<String> temp = new ArrayList<>();
            for(String str:list){
                for(int j=0;j<s2.length();j++){
                    if(str.length()==0 || str.charAt(str.length()-1)!=s2.charAt(j)){
                        temp.add(str + s2.charAt(j));
                    }
                }
            }
            list=temp;
        }
        if(k>list.size()){
            return "";
        }
        return list.get(k-1);
    }
}
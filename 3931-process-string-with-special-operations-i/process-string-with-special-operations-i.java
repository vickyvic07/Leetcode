class Solution {
    public String processStr(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                s1.append(s.charAt(i));
            }else if(s.charAt(i)=='*'){
                if(s1.length()>0){
                s1.deleteCharAt(s1.length()-1);
                }
            }else if(s.charAt(i)=='#'){
                String s2=s1.toString();
                s1.append(s2);
            }else{
                s1.reverse();
            }
        }
        return s1.toString();
    }
}
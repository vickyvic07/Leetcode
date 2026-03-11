class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toString(n,2);
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                s1+='0';
            }else{
                s1+='1';
            }
        }
        return Integer.parseInt(s1,2);
    }
}
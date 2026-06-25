class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder();
        String s1="0";
        for(int i=0;i<n;i++){
            if(s1.length()>=k){
                break;
            }
            String s2=invert(s1);
            s1=s1+"1";
            s1+=s2;
        }
        return s1.charAt(k-1);
    }
    public static String invert(String s1){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                sb.append("0");
            }else{
                sb.append("1");
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
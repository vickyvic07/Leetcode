class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean b=false;
        for(int i=2;i<n-2;i++){
            String s=Integer.toString(n,i);
            //String s1=String.valueOf(s);
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            if(sb.equals(s)){
                b=true;
            }
        }
        return b;
    }
}
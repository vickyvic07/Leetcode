class Solution {
    public int minBitFlips(int start, int goal) {
        String a=Integer.toBinaryString(start);
        String b=Integer.toBinaryString(goal);
        StringBuilder s=new StringBuilder();
        StringBuilder s1=new StringBuilder();
        int maxLen = Math.max(a.length(),b.length());
        for (int i=0;i<maxLen-a.length();i++) {
            s.append('0');
        }
        for (int i=0;i<maxLen-b.length();i++) {
            s1.append('0');
        }
        s.append(a);
        s1.append(b);
    
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                c++;
            }
        }
        return c;
    }
}
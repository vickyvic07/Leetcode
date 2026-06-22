class Solution {
    public int maxNumberOfBalloons(String t) {
        int freq[]=new int[26];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']++;
        }
        String b="balloon";
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
                int count=freq[ch-'a'];
                if (ch=='l'||ch=='o'){
                    count/=2;
                }
                ans=Math.min(ans, count);
        }
        return ans;
    }
}        
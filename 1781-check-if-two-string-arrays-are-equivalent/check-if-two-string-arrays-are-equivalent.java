class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s=new StringBuilder();
         StringBuilder s1=new StringBuilder();
         for(int i=0;i<word1.length;i++){
            for(int j=0;j<word1[i].length();j++){
                s.append(word1[i].charAt(j));
            }
         }
          for(int i=0;i<word2.length;i++){
            for(int j=0;j<word2[i].length();j++){
                s1.append(word2[i].charAt(j));
            }
         }return s.toString().equals(s1.toString());
    }
}
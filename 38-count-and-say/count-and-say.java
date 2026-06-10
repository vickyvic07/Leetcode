class Solution {
    public String countAndSay(int n) {
        String s1="1";
        int i=1;
        while(i<n){
            StringBuilder m=new StringBuilder();
            int c=1;
            for(int j=1;j<s1.length();j++){
               if(s1.charAt(j)==s1.charAt(j-1)){
                c++;
               }else{
                m.append(c);
                m.append(s1.charAt(j-1));
                c=1;
               }
            }
            m.append(c);
             m.append(s1.charAt(s1.length()-1));
             s1=m.toString();
             i++;
        } 
       
        return s1; 
    }
}
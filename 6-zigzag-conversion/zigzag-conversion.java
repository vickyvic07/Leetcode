class Solution {
    public String convert(String s, int n) {
        StringBuilder[] b=new StringBuilder[n];
        if(n==1 || n>=s.length()){
            return s;
        }
        boolean gd=false;
        for(int i=0;i<n;i++){
            b[i]=new StringBuilder();
        }
        int cr=0;
        for(char c:s.toCharArray()){
            b[cr].append(c);
            if(cr==0 || cr==n-1){
                gd=!gd;
            }
            cr+=gd? 1:-1;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder r:b){
            sb.append(r);
        } 
        String v=sb.toString();
        return v;
    }
}
class Solution {
    public int trap(int[] h) {
        int l[]=new int[h.length];
        int r[]=new int[h.length];
        int lm=h[0];
        int rm=h[h.length-1];
        l[0]=lm;
        r[0]=rm;
        int w=0;
        for(int i=1;i<h.length;i++){
            if(h[i]>lm){
                lm=h[i];
            }
            l[i]=lm;
        }
        for(int i=h.length-1;i>=0;i--){
            if(h[i]>rm){
                rm=h[i];
            }
            r[i]=rm;
        }int m=0;
        for(int i=0;i<h.length;i++){
            if(l[i]<r[i]){
                m=l[i];
            }else{
                m=r[i];
            }w+=m-h[i];
        }
        return w;
    }
}
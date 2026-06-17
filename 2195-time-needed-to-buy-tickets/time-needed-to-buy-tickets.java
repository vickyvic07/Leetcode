class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.offer(i);
        }
        int t=0;
        while(!q.isEmpty()){
            t++;
            int ind=q.poll();
            arr[ind]--;
            if(ind==k && arr[ind]==0){
                return t;
            }
            if(arr[ind]!=0){
                q.offer(ind);
            }           
        }
        return t;
    }
}
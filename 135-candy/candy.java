class Solution {
    public int candy(int[] r) {
        int arr[]=new int[r.length];
        int arr1[]=new int[r.length];
        int arr2[]=new int[r.length];
        arr[0]=1;
        int sum=0;
        for(int i=1;i<r.length;i++){
            if(r[i]>r[i-1]){
                arr[i]=arr[i-1]+1;
            }else{
                arr[i]=1;
            }
        }
        arr1[arr1.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            if(r[i]>r[i+1])
            {
                arr1[i]=arr1[i+1]+1;
            }else{
                arr1[i]=1;
            }
            
        }
        for(int i=0;i<r.length;i++){
            if(arr[i]>arr1[i]){
                arr2[i]=arr[i];
            }else{
                arr2[i]=arr1[i];
            }
        }for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }
        return sum;
    }
}
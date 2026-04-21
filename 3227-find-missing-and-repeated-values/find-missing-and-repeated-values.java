class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> n=new HashSet<>();
        int arr[]=new int[2];
        int sum=0,m=grid.length*grid.length;
        int asum=(m*(m+1))/2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!n.add(grid[i][j])){
                    arr[0]=grid[i][j];
                }else{
                    sum+=grid[i][j];
                    n.add(grid[i][j]);
                }   
            }
        }arr[1]=asum-sum;
        return arr;
    }
}
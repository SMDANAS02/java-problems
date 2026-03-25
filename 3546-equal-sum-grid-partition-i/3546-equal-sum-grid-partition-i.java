class Solution {
    public boolean canPartitionGrid(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       long totalsum=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            totalsum+=grid[i] [j];
        }

       }
       long summ=0;
       for(int i=0;i<m-1;i++){
        for(int j=0;j<n;j++){
            summ+=grid[i] [j];
        }
        if(summ ==totalsum-summ)return true;
       }
       summ=0;
       for(int j=0;j<n-1;j++){
        for(int i=0;i<m;i++){
            summ+=grid[i] [j];
        }
        if(summ ==totalsum-summ)return true;
       }
       return false;
    }
}
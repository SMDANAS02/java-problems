class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        // int arr[][]=new int [grid.length][grid[0].length];
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         int product=1;
        //         for(int r=0;r<grid.length;r++){
        //             for(int c=0;c<grid[0].length;c++){
        //                 if(r!=i || c!=j){
        //                     product=(product*grid[r][c])%12345;
        //                 }
        //             }
        //         }
        //         arr[i][j]=product;
        //     }
        // }
        // return arr;
        int m=grid.length;
        int n=grid[0].length;
        int size=m*n;
        int result[]=new int[size];
        int prefix=1;
for(int i=0;i<size;i++){
        result[i] = prefix;
        int val = grid[i/n][i%n] % 12345;
        prefix = (int)((long)prefix * val % 12345);
    }

    int suffix = 1;

    for(int i=size-1;i>=0;i--){
        result[i] = (int)((long)result[i] * suffix % 12345);
        int val = grid[i/n][i%n] % 12345;
        suffix = (int)((long)suffix * val % 12345);
    }

        int arr[][]=new int[m][n];
        for(int i=0;i<size;i++){
             arr[i/n][i%n]=result[i];
        }
        return arr;
            }
}
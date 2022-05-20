class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if(obstacleGrid[row-1][col-1] == 1) return 0;
        int dp[][] = new int[row][col];
        dp[0][0] = 1;
        for(int r=0;r<row;r++) {
            for(int c=0;c<col;c++) {
                if(obstacleGrid[r][c] != 1) {
                    if(r < row-1) 
                        dp[r+1][c] +=dp[r][c];
                    if(c < col-1)
                        dp[r][c+1] += dp[r][c];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
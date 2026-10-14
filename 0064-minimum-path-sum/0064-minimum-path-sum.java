class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        return F(m-1, n-1, dp, grid);
    }

    public int F(int i, int j, int[][] dp, int[][] grid){
        if(i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return (int) 1e9;
        if (dp[i][j] != -1) return dp[i][j];
        int up = grid[i][j] + F(i - 1, j, dp, grid);
        int left = grid[i][j] + F(i, j - 1, dp, grid);
        return dp[i][j] = Math.min(up, left);
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return Solve(dp,m,n);
    }
    public int Solve(int dp[][],int m,int n)
    {
          for(int r = 0;r<m;r++)
        {
            dp[r][n-1] = 1;
        }
        for(int c = 0;c<n;c++)
        {
            dp[m-1][c] = 1;
        }
        for(int i =m-2;i>=0;i--)
        {
            for(int j = n-2;j>=0;j--)
            {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}

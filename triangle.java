class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int dp[][] = new int[triangle.size()+1][triangle.get(triangle.size() - 1).size()];
         for(int[] arr : dp) Arrays.fill(arr, -1);

        return helper(dp, triangle,0,0);
        
        
    }

    public int helper(int dp[][] , List<List<Integer>> triangle, int i, int j)
    {
        if(i == triangle.size()-1)
        {
            return triangle.get(i).get(j);
        }

        if(dp[i][j] != -1)
        return dp[i][j];

        dp[i][j] = Math.min(triangle.get(i).get(j)+helper(dp, triangle, i+1,j),triangle.get(i).get(j)+ helper(dp , triangle,i+1,j+1));

        return dp[i][j];

    }
}

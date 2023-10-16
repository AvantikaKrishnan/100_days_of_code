class Solution {
    public int minDistance(String word1, String word2) {

        int dp[][] = new int[word2.length()+1][word1.length()+1];
        return helper(dp,word1,word2);
        
    }
    public int helper(int dp[][], String word1, String word2)
    {
        for(int i =0;i<=word2.length();i++)
        {
            for(int j = 0;j<=word1.length();j++)
            {
                if(i==0)
                dp[i][j] = j;

                else if(j ==0 )
                dp[i][j] = i;

                else if(word2.charAt(i-1) == word1.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];


                }
                else
                {
                    dp[i][j] = 1+ Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }

          
        }
        // for(int i =0;i<dp.length;i++)
        // {
        //     for(int j= 0 ;j<dp[0].length;j++)
        //     {
        //         System.out.print(dp[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
          return dp[word2.length()][word1.length()];
    }
}

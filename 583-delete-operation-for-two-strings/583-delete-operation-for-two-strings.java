/*
* Approach 2: Using LCS -> Dynamic Approach
* We make use of a 2-D dpdp, in which dp[i][j] represents the length of the longest common subsequence among the * strings. We fill the dpdp array in row-by-row order.
*
*/

class Solution {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2 * lcs(word1, word2, word1.length(), word2.length());
    }
    
    private static int lcs(String str1, String str2, int m, int n){
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    continue;
                }
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
    }
}
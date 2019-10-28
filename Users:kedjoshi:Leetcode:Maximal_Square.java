package users.kedjoshi.leetcode;

public class Maximal_Square{
    public static class Solution{
        public int maximalSquare(char[][] mat){
            if(matrix == null || matrix.length == 0){
                return 0;
            }

            int m = matrix.length;
            int n = matrix[0].length;
            int max = Integer.MIN_VALUE;

            int[][] dp = new int[m][n];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i==0 || j==0){
                        dp[i][j] = (mat[i][j] == '1') ? 1 : 0;
                    }

                    else if(mat[i][j] == '0'){
                        dp[i][j] = 0;
                    }
                    else
                        dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1],dp[i][j-1]) + 1;
                }

                max = (max < dp[i][j]) ? dp[i][j] : max;
            }

            return max*max;

        }
    }
}
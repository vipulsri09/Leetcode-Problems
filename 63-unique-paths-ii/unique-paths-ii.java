// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][]dp=new int[n][m];
//         dp[0][0]=1;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(i==0 || j==0){
//                     dp[i][j]=1;
//                 }else{
//                     int up=dp[i-1][j];
//                     int left=dp[i][j-1];
//                     dp[i][j]=up+left;
//                 }
//             }
//         }
//         return dp[n-1][m-1];
//     }
// }

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];

        if (obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else if (!(i == 0 && j == 0)) {
                    int up = 0;
                    int left = 0;
                    if (i > 0) up = dp[i - 1][j];
                    if (j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}

class Solution {
    public static int countLive(int[][] board, int row, int col) {
        int count = 0;
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (board[newRow][newCol] == 1 || board[newRow][newCol] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                int liveCnt = countLive(board, i, j);
                if (board[i][j] == 1 || board[i][j] == -1) {
                    if (liveCnt < 2 || liveCnt > 3) {
                        board[i][j] = -1;
                    }
                } else {
                    if (liveCnt == 3) {
                        board[i][j] = -2;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == -2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}

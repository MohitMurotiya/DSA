class Solution {
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        return solve(board, 0, n, 0);
    }
    
    private static int solve(int[][] board, int col, int n, int count){
        if(col >= n){
            count++;
            return count;
        }
        int temp = count;
        for(int row = 0; row < n; row++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                temp += solve(board, col + 1, n, count);
                board[row][col] = 0;
            }
        }
        return temp;
    }
    
    private static boolean isSafe(int[][] board, int row, int col, int n){
        int i,j;
        for(i = 0; i < col; i++){
            if(board[row][i] == 1){
                return false;
            }
        }
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1)
                return false;
        }
        for(i = row, j = col; i < n && j >= 0; i++, j--){
            if(board[i][j] == 1)
                return false;
        }
        return true;
    }
}
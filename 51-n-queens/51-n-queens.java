import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        
        solve(board, 0, n, ans);
        return ans;
    }
    
    private static void solve(char[][] board, int col, int n, List<List<String>> ans){
        if(col >= n){
            ans.add(distinctSolution(board, n));
            return;
        }
        
        for(int row = 0; row < n; row++){
            if(isSafe(board, col, row, n)){
                board[row][col] = 'Q';
                solve(board, col+1, n, ans);
                board[row][col] = '.';
            }
        }
    }
    
    private static boolean isSafe(char[][] board, int col, int row, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < col; j++){
                /*
                * i) check in same row: row == i
                * ii) check upper left diagonal: n-1+col-row
                * iii) check lower left diagonal: row + col
                */
                if(board[i][j] == 'Q' && (row == i || row + col == i + j || col - row == j - i)){
                    return false;
                }       
            }
        }
        return true;
    }
    
    private static List<String> distinctSolution(char[][] board, int n){
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < n; i++) {
            String str = new String(board[i]);
            res.add(str);
        }
        return res;
    }
}
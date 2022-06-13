class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n;j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(0, board, res);
        return res;
    }
    
    public boolean validate(int col, int row, char[][] board) {
        int dupcol = col;
        int duprow = row;
        
        while(col>=0) {
            if(board[row][col] == 'Q') return false;
            col--;
        }
        
        row = duprow;
        col = dupcol;
        
        while(row >=0 && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        
        row = duprow;
        col = dupcol;
        
        while(row < board.length && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        
        return true;
    }
    
    public void dfs(int col, char[][] board, List<List<String>> res) {
        if(col == board.length) {
            res.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++) {
            if(validate(col, row, board)) {
                board[row][col] = 'Q';
                dfs(col+1, board, res);
                board[row][col] = '.';
            }
        }
    }
    
    List<String> construct(char[][] board) {
        List<String> list = new LinkedList<>();
        for(int i=0; i<board.length; i++) 
            list.add(new String(board[i]));
        return list;
    }
}
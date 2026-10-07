class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                // Find an empty cell
                if (board[row][col] == '.') {

                    // Try every possible digit
                    for (char digit = '1'; digit <= '9'; digit++) {

                        if (isValid(board, row, col, digit)) {

                            // Choose
                            board[row][col] = digit;

                            // Explore
                            if (solve(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }

                    // No digit works for this cell
                    return false;
                }
            }
        }

        // No empty cell remains
        return true;
    }

    private boolean isValid(
            char[][] board,
            int row,
            int col,
            char digit
    ) {

        for (int i = 0; i < 9; i++) {

            // Check row
            if (board[row][i] == digit) {
                return false;
            }

            // Check column
            if (board[i][col] == digit) {
                return false;
            }

            // Check 3 × 3 sub-box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == digit) {
                return false;
            }
        }

        return true;
    }
}
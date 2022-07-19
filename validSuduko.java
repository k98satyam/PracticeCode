// https://leetcode.com/problems/valid-sudoku/

class validSuduko {
    public boolean isValidSudoku(char[][] board) {
        int[] arr = new int[9];

        // chceking all rows
        for (int i = 0; i < 9; i++) {
            // resetting array
            arr = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (arr[board[i][j] - '1'] > 0)
                    return false;
                arr[board[i][j] - '1']++;
            }
        }

        // chceking all columns
        for (int i = 0; i < 9; i++) {
            // resetting array
            arr = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 1
        // resetting array
        arr = new int[9];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 2
        // resetting array
        arr = new int[9];
        for (int i = 0; i <= 2; i++) {
            for (int j = 3; j <= 5; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 3
        // resetting array
        arr = new int[9];
        for (int i = 0; i <= 2; i++) {
            for (int j = 6; j <= 8; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 4
        // resetting array
        arr = new int[9];
        for (int i = 3; i <= 5; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 5
        // resetting array
        arr = new int[9];
        for (int i = 3; i <= 5; i++) {
            for (int j = 3; j <= 5; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 6
        // resetting array
        arr = new int[9];
        for (int i = 3; i <= 5; i++) {
            for (int j = 6; j <= 8; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 7
        // resetting array
        arr = new int[9];
        for (int i = 6; i <= 8; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 8
        // resetting array
        arr = new int[9];
        for (int i = 6; i <= 8; i++) {
            for (int j = 3; j <= 5; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        // box 9
        // resetting array
        arr = new int[9];
        for (int i = 6; i <= 8; i++) {
            for (int j = 6; j <= 8; j++) {
                if (board[j][i] == '.')
                    continue;
                if (arr[board[j][i] - '1'] > 0)
                    return false;
                arr[board[j][i] - '1']++;
            }
        }

        return true;
    }
}

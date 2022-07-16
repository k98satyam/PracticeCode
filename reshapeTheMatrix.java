// https://leetcode.com/problems/reshape-the-matrix/

class reshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arrayRowSize = mat.length;
        int arrayColSize = mat[0].length;

        if (r * c != arrayRowSize * arrayColSize) {
            return mat;
        }

        int ans[][] = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i[] : mat) {
            for (int j : i) {
                if (col < c) {
                    ans[row][col] = j;
                    col++;
                } else {
                    row++;
                    col = 0;
                    ans[row][col] = j;
                    col++;
                }
            }
        }

        return ans;
    }
}
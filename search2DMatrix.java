// https://leetcode.com/problems/search-a-2d-matrix/

class search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colSize = matrix[0].length - 1;
        int rowSize = matrix.length - 1;

        int mid = 0, index = 0;
        int left = 0, right = rowSize;

        if (matrix[0][0] > target || matrix[rowSize][colSize] < target)
            return false;

        // find row using binary search
        while (right >= left) {
            mid = (left + right) / 2;
            if (matrix[mid][0] == target || matrix[mid][colSize] == target)
                return true;
            if (matrix[mid][0] < target && matrix[mid][colSize] > target) {
                index = mid;
                break;
            } else if (matrix[mid][colSize] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        // finding element in column
        left = 0;
        right = colSize;
        while (right >= left) {
            mid = (left + right) / 2;
            if (matrix[index][mid] == target)
                return true;
            else if (matrix[index][mid] > target)
                right = mid - 1;
            else if (matrix[index][mid] < target)
                left = mid + 1;
        }

        return false;
    }

    // Same shit but a tad bit approach to write code -- both have almost same time
    // complexity
    // above one log n + log m, below one log(n+m)

    // public boolean searchMatrix(int[][] matrix, int target) {
    // if (matrix == null || matrix.length == 0) {
    // return false;
    // }
    // int start = 0, rows = matrix.length, cols = matrix[0].length;
    // int end = rows * cols - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (matrix[mid / cols][mid % cols] == target) {
    // return true;
    // }
    // if (matrix[mid / cols][mid % cols] < target) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return false;
    // }
}
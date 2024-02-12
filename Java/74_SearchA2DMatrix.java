class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        while(row < matrix.length-1){
            if(target <= matrix[row][matrix[0].length-1]){
                if(target == matrix[row][matrix[0].length-1]){
                    return true;
                }
                break;
            }
            row++;
        }
        for(int column = 0; column < matrix[0].length; column++){
            if(target == matrix[row][column]){
                return true;
            }
        }
        return false;
    }
}
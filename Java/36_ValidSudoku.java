class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] column = new int[9];
        int[] box = new int[3];

        for(int i=0;i<9;i++){
            int row = 0;
            //box[] stores 3 boxes in a vertical line and resets every 3 rows
            if(i%3==0){
                box = new int[3];
            }

            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                //bitshift 1 by ASCII value of number on board
                int n = 1 << board[i][j];

                //row == (row | n) checks for duplicate numbers in same row
                if(row == (row | n)){
                    return false;
                }else{
                    row = row | n;
                }

                //checks for duplicates in column
                if(column[j] == (column[j] | n)){
                    return false;
                }else{
                    column[j] = column[j] | n;
                }
                //boxId selects box 0 = left, 1 = middle, 2 = right
                int boxId = j/3;
                //checks for duplicates in box
                if(box[boxId] == (box[boxId] | n)){
                    return false;
                }else{
                    box[boxId] = box[boxId] | n;
                }

            }
        }

        return true;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //must be O(n) without use of division
        final int SIZE = nums.length;
        int[] output = new int[SIZE];

        /*
        multiply values in nums in ascending order and store in output
        ex. 
        nums =   [1, 2, 3, 4]
        output = [1, 1, 2, 6]
        */
        for(int i = 0, prefix = 1; i < SIZE; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }
        /*
        multiply values in output by the factorials of previous numbers
        and by the number adjacent to it in descending order
        ex. 
        nums =   [1, 2, 3, 4]
        output = [1, 1, 2, 6]
        output = [(1*24), (1*12), (2*4), (6*1)]
        */
        for(int i = SIZE-1, postfix = 1; i >= 0; i--){
            output[i] *= postfix;
            postfix *= nums[i];
        }
        return output;
    }
}
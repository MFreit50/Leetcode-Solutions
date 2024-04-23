class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        /*
         * It's impossible for two OR'd even numbers
         * to not have trailing zeros
        */
        int count = 0;
        for(int i : nums){
            if(i%2 == 0){
                count++;
            }
        }
        return count > 1;
    }
}
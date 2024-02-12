class Solution {
    public boolean canJump(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + i >= nums.length-1){
                return true;
            }
            //find a number that will jump past 0
            if(nums[i] == 0){
                int count = 1;
                for(int j = i; j > -1; j--){
                    if(nums[j] >= count){
                        break;
                    }
                    count++;
                    if(j == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
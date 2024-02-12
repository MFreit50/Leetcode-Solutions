class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            final int sum = numbers[left] + numbers[right];
            if(sum == target){
                //array is 1 indexed
                return new int[] {left+1, right+1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {0, 0};
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while(left<right){
            int mid = left+((right-left)>>1);
            if((double)mid*(double)mid<num){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left*left == num;
    }
}
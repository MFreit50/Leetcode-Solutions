class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;
        while(left < right){
            final int area = Math.min(height[right],height[left]);
            //length = right - left
            maxArea = Math.max(maxArea, area*(right-left));
            while(height[left] <= area && left < right){
                left++;
            }
            while(height[right] <= area && left < right){
                right--;
            } 
        }
        return maxArea;
    }
}
class Solution {
    public int mySqrt(int x) {
        //Math.sqrt() not allowed
        if(x < 2){
            return x;
        }

        int mid = 0;
        int low = 1;
        int high = x;
        
        while(low<=high){
        	mid = (high+low)/2;
        	if(mid<= x/mid && (mid+1)>x/(mid+1)){
        		return mid;
        	}else if(mid > x/mid){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return mid;
    }
}
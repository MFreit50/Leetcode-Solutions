class Solution {
    public int[] countBits(int n) {
        int[] bitCount = new int[n+1];
        for(int i = 1; i < bitCount.length; i++){
            int count = 0;
            int b = i;

            /*
            subtracting 1 from a binary sets the rightmost 1 to 0
            and all numbers before it to 1 effectively creating a bitmask

            ex. 11000 - 1 = 10111
            */
            while(b != 0){
                count++;
                b = ((b-1)&b);
            }
            bitCount[i] = count;
        }
        return bitCount;
    }
}
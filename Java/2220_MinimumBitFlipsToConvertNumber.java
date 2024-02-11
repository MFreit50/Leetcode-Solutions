class Solution {
    public int minBitFlips(int start, int goal) {
        //reassign start as start XOR goal to save memory
        start ^= goal;
        //reassign goal to 0 to use as counter
        goal = 0;
        //count bits (start XOR goal = difference in bits)
        while(start != 0){
            goal += 1;
            start &= start-1;
        }
        return goal;
    }
}
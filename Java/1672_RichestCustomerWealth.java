class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for(int k = 0; k < accounts[i].length; k++){
                wealth += accounts[i][k];
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
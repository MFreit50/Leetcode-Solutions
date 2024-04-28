public class Solution {
    public int MaximumWealth(int[][] accounts){
        int maxWealth = 0;
        for(int i = 0; i < accounts.Length; i++){
            int wealth = 0;
            for(int k = 0; k < accounts[i].Length; k++){
                wealth += accounts[i][k];
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
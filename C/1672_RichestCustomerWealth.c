int maximumWealth(int** accounts, int accountsSize, int* accountsColSize){
    int maxWealth = 0;
    for(int i = 0; i < accountsSize; i++){
        int wealth = 0;
        for(int k = 0; k < accountsColSize[i]; k++){
            wealth += accounts[i][k];
        }
        if(wealth > maxWealth){
            maxWealth = wealth;
        }
    }
    return maxWealth;
}
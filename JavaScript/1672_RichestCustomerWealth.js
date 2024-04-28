/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let maxWealth = 0;
    for(let i = 0; i < accounts.length; i++){
        let wealth = 0;
        for(let k = 0; k < accounts[i].length; k++){
            wealth += accounts[i][k];
        }
        if(wealth > maxWealth){
            maxWealth = wealth;
        }
    }
    return maxWealth;
};
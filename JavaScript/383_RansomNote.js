/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    for(let i = 0; i < ransomNote.length; i++){
        let letter = ransomNote.charAt(i);
        const found = magazine.indexOf(letter);
        if(found == -1){
            return false;
        }
        magazine = magazine.replace(letter,'');

    }
    return true;
};
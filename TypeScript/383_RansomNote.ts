//@ts-ignore
function canConstruct(ransomNote: string, magazine: string): boolean {
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
#include <stdbool.h>
bool canConstruct(char* ransomNote, char* magazine) {
    int alphabet[26] = {0};
    int i = 0;
    while(ransomNote[i] != '\0'){
        alphabet[ransomNote[i] - 'a']++;
        i++;
    }
    i = 0;
    while(magazine[i] != '\0'){
        alphabet[magazine[i] - 'a']--;
        i++;
    }
    for(int i = 0; i < 26; i++){
        if(alphabet[i] > 0){
            return false;
        }
    }
    return true;
}
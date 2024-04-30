public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        int[] alphabet = new int[26];
        int i;
        foreach(char c in ransomNote){
            i = magazine.IndexOf(c, alphabet[c - 'a']);
            if(i == -1){//character not in magazine
                return false;
            }
            alphabet[c-'a'] = i+1;
        } 
        return true;
    }
}
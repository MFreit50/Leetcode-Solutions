class Solution {
    public boolean isAnagram(String s, String t) {
        //keeps track of letter frequency
        int[] frequency = new int[26];

        //c-97 indexes lowercase letter ASCII values to 0 for array compatibility
        for(char c : s.toCharArray()){
            frequency[(c-97)]++;
        }

        for(char c : t.toCharArray()){
            frequency[(c-97)]--;
        }
        
        //if both words even out all indexes of frequency should equal 0
        for(int i : frequency){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
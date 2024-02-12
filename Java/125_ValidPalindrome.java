class Solution {
    public boolean isPalindrome(String s) {
        //i points to beginning of word, j points to end of word
        int i=0, j=s.length()-1;
        while(i < j){
            //set 6th bit to 1 (capitalizes letters, doesn't affect numbers)
            int ic = (s.charAt(i)|0b100000);
            //skip character if it is a symbol
            if(! ((ic >='a' && ic <='z') || (ic>='0' && ic <= '9'))){
                i++;
                continue;
            }
            int jc = (s.charAt(j)|0b100000);
            if(! ((jc >='a' && jc <='z') || (jc>='0' && jc <= '9'))){
                j--;
                continue;
            }
            if(ic != jc){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
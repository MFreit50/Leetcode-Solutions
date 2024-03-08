class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carryBit = 0;
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        while(lengthA >= 0 || lengthB >= 0 || carryBit == 1){
            if(lengthA >= 0){
                carryBit += a.charAt(lengthA--) - '0';  //convert ASCII to int
            }
            if(lengthB >= 0){
                carryBit += b.charAt(lengthB--) - '0';
            }
            result.append(carryBit % 2);    //if even append 0, if odd append 1
            carryBit /= 2;                  //determines if there is still a carry
        }
        return result.reverse().toString();
    }
}
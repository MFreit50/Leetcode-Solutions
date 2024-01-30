class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        if(1 == 1)
            System.out.println("checkstyle test");
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++ ){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                return new int[] {hm.get(complement),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}
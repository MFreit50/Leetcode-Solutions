class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] frequency = new int[k];

        //if hm contains key increment else add key with value 1
        for(int i : nums){
            hm.put(i, hm.containsKey(i) ? hm.get(i) + 1 : 1);
        }

        //populates ArrayList with HashMap keys
        List<Integer> list = new ArrayList<>(hm.keySet());

        //sort list based on Value of the HashMap key value pair
        list.sort((a, b) -> hm.get(b) - hm.get(a));

        for(int i = 0; i < k; i++){
            frequency[i] = list.get(i);
        }

        return frequency;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> my_map = new HashMap<>();
        for (int i=0;i< nums.length; i++){
            if(my_map.containsKey(target-nums[i])){
                return new int[] {my_map.get(target-nums[i]), i}; 
            }
            my_map.put(nums[i], i);
        } throw new IllegalArgumentException("no match found");
    }
}
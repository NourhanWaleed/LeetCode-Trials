class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<String>();
        int index=0;
        while(index< nums.length){
            int beg = nums[index], end;
            while(index+1 < nums.length && nums[index+1] - nums[index] ==1)
                index++;
            end = nums[index];
            if (beg == end) output.add(beg + "");
            else output.add(beg + "->" + end);
            index++;
        } return output;
    }
}
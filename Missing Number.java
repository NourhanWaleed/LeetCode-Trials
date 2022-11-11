class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len*(len+1)/2;
        int sum2=0;
        for(int i=0; i<len;i++)
        sum2 += nums[i];
        return sum - sum2;
    }
}
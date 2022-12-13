class Solution {
    public int thirdMax(int[] nums) {
        
         int l = nums.length;
        Arrays.sort(nums);
        int r = 1;
        for(int i=l-2;i>=0;i--){
            if(nums[i]!=nums[i+1])r++;
            if(r==3)return nums[i];
        }
        return nums[l-1];
    }
}
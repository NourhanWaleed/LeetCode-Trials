class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1,mid=start;
        if (target > nums[end]) return end+1;
        if (target < nums[0]) return 0;
        
        if (target == nums[start]) return start;
        if (target == nums[end]) return end;
        while(start<end){
            mid= (start+end)/2;
            if(target== nums[mid])
                return mid;
            else if(target< nums[mid])
                end = mid;
            else if(target > nums[mid])
                start=mid+1;
        }
        if (target < nums[mid])  return mid;
        if (target > nums[mid])  return mid+1;
        
        return 0;
    }
}